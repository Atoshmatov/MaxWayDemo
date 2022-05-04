package uz.gita.maxwaydemo.mobdev.domain.mainrepository.home

import kotlinx.coroutines.flow.Flow
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel

interface HomeRepository {
    // ads model
    suspend fun getAds(): Flow<Result<List<AdsModel>>>

    // category model
    suspend fun getCategory(): Flow<Result<List<CategoryModel>>>

    //foods model
    suspend fun getFoods(): Flow<Result<List<List<FoodsModel>>>>
}