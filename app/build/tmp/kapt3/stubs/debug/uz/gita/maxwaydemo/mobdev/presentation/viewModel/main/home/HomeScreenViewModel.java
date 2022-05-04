package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH&R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/home/HomeScreenViewModel;", "", "adsLiveData", "Landroidx/lifecycle/LiveData;", "", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "getAdsLiveData", "()Landroidx/lifecycle/LiveData;", "categoryLiveData", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/CategoryModel;", "getCategoryLiveData", "changeLiveData", "", "getChangeLiveData", "errorLiveData", "", "getErrorLiveData", "startAds", "", "count", "app_debug"})
public abstract interface HomeScreenViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel>> getAdsLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel>> getCategoryLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.Integer> getChangeLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.lang.String> getErrorLiveData();
    
    public abstract void startAds(int count);
}