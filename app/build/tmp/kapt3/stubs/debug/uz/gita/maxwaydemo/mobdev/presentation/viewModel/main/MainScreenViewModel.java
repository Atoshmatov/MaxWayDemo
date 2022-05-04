package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\b\u0010\r\u001a\u00020\u0004H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/MainScreenViewModel;", "", "openBasketScreenLiveData", "Landroidx/lifecycle/LiveData;", "", "getOpenBasketScreenLiveData", "()Landroidx/lifecycle/LiveData;", "openHomeScreenLiveData", "getOpenHomeScreenLiveData", "openLoginScreenLiveData", "getOpenLoginScreenLiveData", "openBasketScreen", "openHomeScreen", "openLoginScreen", "app_debug"})
public abstract interface MainScreenViewModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getOpenHomeScreenLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getOpenBasketScreenLiveData();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<kotlin.Unit> getOpenLoginScreenLiveData();
    
    public abstract void openHomeScreen();
    
    public abstract void openBasketScreen();
    
    public abstract void openLoginScreen();
}