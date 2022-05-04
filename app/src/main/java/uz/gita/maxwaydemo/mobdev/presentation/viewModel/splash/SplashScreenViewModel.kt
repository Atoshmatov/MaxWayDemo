package uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash

import androidx.lifecycle.LiveData

interface SplashScreenViewModel {
    val nextMainScreenLivedata:LiveData<Unit>
}