package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home

import androidx.lifecycle.LiveData
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel

interface HomeScreenViewModel {
    val adsLiveData: LiveData<List<AdsModel>>
    val categoryLiveData: LiveData<List<CategoryModel>>
    val changeLiveData: LiveData<Int>
    val errorLiveData:LiveData<String>

    fun startAds(count: Int)
}