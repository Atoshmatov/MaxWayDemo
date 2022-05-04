package uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash.SplashScreenViewModel
import javax.inject.Inject

@HiltViewModel
class SplashScreenViewModelImpl
@Inject constructor() : ViewModel(), SplashScreenViewModel {
    override val nextMainScreenLivedata = MutableLiveData<Unit>()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            delay(1000)
            nextMainScreenLivedata.postValue(Unit)
        }
    }
}