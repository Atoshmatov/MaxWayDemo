package uz.gita.maxwaydemo.mobdev.presentation.views.screen.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.maxwaydemo.mobdev.R
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash.SplashScreenViewModel
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.splash.impl.SplashScreenViewModelImpl


@AndroidEntryPoint
@SuppressLint("CustomSplashScreen")
class SplashScreen : Fragment(R.layout.screen_splash) {
    private val viewModel: SplashScreenViewModel by viewModels<SplashScreenViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.nextMainScreenLivedata.observe(this@SplashScreen, nextMainScreenObserver)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

    private val nextMainScreenObserver = Observer<Unit> {
        findNavController().navigate(R.id.action_splashScreen_to_mainScreen)
    }
}