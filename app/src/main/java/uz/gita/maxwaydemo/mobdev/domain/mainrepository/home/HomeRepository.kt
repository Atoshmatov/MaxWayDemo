package uz.gita.maxwaydemo.mobdev.domain.mainrepository.home

import kotlinx.coroutines.flow.Flow
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel

interface HomeRepository {
    // ads model
    fun getAds(): Flow<Result<List<AdsModel>>>

    // category model
    fun getCategory(): Flow<Result<List<CategoryModel>>>

    //foods model
    fun getFoods(): Flow<Result<List<FoodsModel>>>
}