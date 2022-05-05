package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home

import androidx.lifecycle.LiveData
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel

interface HomeScreenViewModel {
    val adsLiveData: LiveData<List<AdsModel>>
    val categoryLiveData: LiveData<List<CategoryModel>>
    val foodLiveData: LiveData<List<FoodsModel>>
    val changeLiveData: LiveData<Int>
    val errorLiveData: LiveData<String>

    fun startAds(count: Int)
}