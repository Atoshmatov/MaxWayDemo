package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.impl

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.MainScreenViewModel
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModelImpl @Inject constructor(): ViewModel(), MainScreenViewModel {
    override val openHomeScreenLiveData = MutableLiveData<Unit>()
    override val openBasketScreenLiveData = MutableLiveData<Unit>()
    override val openLoginScreenLiveData = MutableLiveData<Unit>()

    override fun openHomeScreen() {
        openHomeScreenLiveData.value = Unit
    }

    override fun openBasketScreen() {
        openBasketScreenLiveData.value = Unit
    }

    override fun openLoginScreen() {
        openLoginScreenLiveData.value = Unit
    }
}