package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main

import androidx.lifecycle.LiveData

interface MainScreenViewModel {
    val openHomeScreenLiveData: LiveData<Unit>
    val openBasketScreenLiveData: LiveData<Unit>
    val openLoginScreenLiveData: LiveData<Unit>

    fun openHomeScreen()
    fun openBasketScreen()
    fun openLoginScreen()
}