package uz.gita.maxwaydemo.mobdev.presentation.views.screen.main.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.maxwaydemo.mobdev.R
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel
import uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel
import uz.gita.maxwaydemo.mobdev.databinding.ScreenHomeBinding
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home.HomeScreenViewModel
import uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home.impl.HomeScreenViewModelImpl
import uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.AdsAdapter
import uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.CategoryAdapter
import uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.FoodsAdapter

@AndroidEntryPoint
class HomeScreen : Fragment(R.layout.screen_home) {
    private val viewModel: HomeScreenViewModel by viewModels<HomeScreenViewModelImpl>()
    private val binding by viewBinding(ScreenHomeBinding::bind)
    private val adsAdapter = AdsAdapter()
    private val categoryAdapter = CategoryAdapter()
    private val foodsAdapter = FoodsAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {

        adsSlide.adapter = adsAdapter
        TabLayoutMediator(adsTab, adsSlide) { _, _ -> }.attach()

        collList.adapter = categoryAdapter
        collList.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        listFoods.adapter = foodsAdapter
        listFoods.layoutManager =
            GridLayoutManager(requireContext(), 2)
        viewModel.adsLiveData.observe(viewLifecycleOwner, adsObserver)
        viewModel.changeLiveData.observe(viewLifecycleOwner, changeAdsObserver)
        viewModel.categoryLiveData.observe(viewLifecycleOwner, categoryObserver)
        viewModel.foodLiveData.observe(viewLifecycleOwner, foodObserver)
    }


    private val adsObserver = Observer<List<AdsModel>> {
        adsAdapter.submitList(it)
        viewModel.startAds(it.size)
    }

    private val changeAdsObserver = Observer<Int> {
        binding.adsSlide.setCurrentItem(it, true)
    }

    private val categoryObserver = Observer<List<CategoryModel>> {
        categoryAdapter.submitList(it)
    }

    private val foodObserver = Observer<List<FoodsModel>> {
        foodsAdapter.submitList(it)
    }
}