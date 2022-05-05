package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel
import uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.HomeRepository
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home.HomeScreenViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModelImpl
@Inject constructor(
    private val repository: HomeRepository
) : ViewModel(),
    HomeScreenViewModel {
    override val adsLiveData = MutableLiveData<List<AdsModel>>()
    override val categoryLiveData = MutableLiveData<List<CategoryModel>>()
    override val foodLiveData = MutableLiveData<List<FoodsModel>>()
    override val changeLiveData = MutableLiveData<Int>()
    override val errorLiveData = MutableLiveData<String>()

    private var categories = ArrayList<CategoryModel>()

    init {
        loadAds()
        loadCategories()
        loadFoods()
    }


    override fun startAds(count: Int) {
        adsLoader(count).onEach {
            changeLiveData.postValue(it)
        }.launchIn(viewModelScope)
    }

    private fun loadAds() {
        repository.getAds().onEach {
            it.onSuccess { list ->
                adsLiveData.value = list

            }.onFailure { error ->
                errorLiveData.value = error.message
            }
        }.launchIn(viewModelScope)
    }

    private fun adsLoader(count: Int) = flow {
        var index = 0
        var step = 1
        while (true) {
            emit(index)
            index += step
            if (index == count || index < 0) {
                step = if (index == count)
                    -1
                else
                    1
                index += step
            } else {
                delay(3000)
            }
        }
    }.flowOn(Dispatchers.IO)

    private fun loadCategories() {
        repository.getCategory().onEach {
            it.onSuccess { categories ->
                categoryLiveData.value = categories
            }
            it.onFailure { error ->
                errorLiveData.value = error.message
            }
        }.launchIn(viewModelScope)
    }

    private fun loadFoods() {
        repository.getFoods().onEach {
            it.onSuccess { foods ->
                foodLiveData.value = foods
            }.onFailure { error ->
                errorLiveData.value = error.message
            }
        }.launchIn(viewModelScope)
    }
}