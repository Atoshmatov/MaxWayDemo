package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home.impl;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/home/impl/HomeScreenViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/home/HomeScreenViewModel;", "repository", "Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/HomeRepository;", "(Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/HomeRepository;)V", "adsLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "getAdsLiveData", "()Landroidx/lifecycle/MutableLiveData;", "categories", "Ljava/util/ArrayList;", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/CategoryModel;", "categoryLiveData", "getCategoryLiveData", "changeLiveData", "", "getChangeLiveData", "errorLiveData", "", "getErrorLiveData", "adsLoader", "Lkotlinx/coroutines/flow/Flow;", "count", "loadAds", "", "loadCategories", "startAds", "app_debug"})
public final class HomeScreenViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home.HomeScreenViewModel {
    private final uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.HomeRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel>> adsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel>> categoryLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> changeLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorLiveData = null;
    private java.util.ArrayList<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel> categories;
    
    @javax.inject.Inject()
    public HomeScreenViewModelImpl(@org.jetbrains.annotations.NotNull()
    uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.HomeRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel>> getAdsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel>> getCategoryLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> getChangeLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<java.lang.String> getErrorLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void startAds(int count) {
    }
    
    private final void loadAds() {
    }
    
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> adsLoader(int count) {
        return null;
    }
    
    private final void loadCategories() {
    }
}