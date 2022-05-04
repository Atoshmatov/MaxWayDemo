package uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.impl

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.FirebaseStorage
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.flow.flowOn
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel
import uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.HomeRepository
import javax.inject.Inject

class HomeRepositoryImpl
@Inject constructor(
    store: FirebaseFirestore
) : HomeRepository {

    private val ads = store.collection("ads")
    private val category = store.collection("category")
    private val foods = store.collection("foods")

    override suspend fun getAds() = callbackFlow<Result<List<AdsModel>>> {
        ads.get()
            .addOnSuccessListener {
                val data = it.map { item ->
                    item.toObject(AdsModel::class.java)
                }
                trySend(Result.success(data))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
        awaitClose {

        }
    }.flowOn(Dispatchers.IO)

    override suspend fun getCategory() = callbackFlow<Result<List<CategoryModel>>> {
        category.get()
            .addOnSuccessListener {
                val data = it.map { category ->
                    category.toObject(CategoryModel::class.java)
                }
                trySend(Result.success(data))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
        awaitClose {

        }
    }.flowOn(Dispatchers.IO)

    override suspend fun getFoods() = callbackFlow<Result<List<List<FoodsModel>>>> {
        foods.get()
            .addOnSuccessListener {
                val data = it.map { food ->
                    food.toObject(FoodsModel::class.java)
                }
                val foods = ArrayList<ArrayList<FoodsModel>>()

                for (i in 1L..13) {
                    val temp = ArrayList<FoodsModel>()
                    for (j in data) {
                        with(j) {
                            if (name != null && categoryID == i) {
                                temp.add(j)
                            }
                        }
                    }
                    if (temp.isNotEmpty())
                        foods.add(temp)
                }
                trySend(Result.success(foods))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
        awaitClose {

        }
    }.flowOn(Dispatchers.IO)
}