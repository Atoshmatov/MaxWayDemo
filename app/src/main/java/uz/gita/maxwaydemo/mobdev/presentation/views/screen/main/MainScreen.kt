package uz.gita.maxwaydemo.mobdev.presentation.views.screen.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.maxwaydemo.mobdev.R
import uz.gita.maxwaydemo.mobdev.databinding.ScreenMainBinding
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.MainScreenViewModel
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.impl.MainScreenViewModelImpl
import uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.MainAdapter
import uz.gita.maxwaydemo.mobdev.presentation.views.screen.main.basket.BasketScreen
import uz.gita.maxwaydemo.mobdev.presentation.views.screen.main.home.HomeScreen
import uz.gita.maxwaydemo.mobdev.presentation.views.screen.main.login.LoginScreen

@AndroidEntryPoint
class MainScreen : Fragment(R.layout.screen_main) {
    private val viewModel: MainScreenViewModel by viewModels<MainScreenViewModelImpl>()
    private val binding by viewBinding(ScreenMainBinding::bind)
    private val adapter by lazy { MainAdapter(childFragmentManager, lifecycle) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        adapter.setListPager(arrayListOf(HomeScreen(), BasketScreen(), LoginScreen()))
        mainPager.adapter = adapter
        mainPager.isUserInputEnabled = false

        navigationButton.apply {
            itemIconTintList = null
            setOnItemReselectedListener {}
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.home -> {
                        viewModel.openHomeScreen()
                        true
                    }
                    R.id.basket -> {
                        viewModel.openBasketScreen()
                        true
                    }
                    else -> {
                        viewModel.openLoginScreen()
                        true
                    }
                }
            }
        }
        viewModel.openHomeScreenLiveData.observe(viewLifecycleOwner, openHomeScreenObserver)
        viewModel.openBasketScreenLiveData.observe(viewLifecycleOwner, openOrdersScreenObserver)
        viewModel.openLoginScreenLiveData.observe(viewLifecycleOwner, openProfileScreenObserver)
    }

    private val openHomeScreenObserver = Observer<Unit> {
        binding.mainPager.currentItem = 0
    }

    private val openOrdersScreenObserver = Observer<Unit> {
        binding.mainPager.currentItem = 1
    }

    private val openProfileScreenObserver = Observer<Unit> {
        binding.mainPager.currentItem = 2
    }
}