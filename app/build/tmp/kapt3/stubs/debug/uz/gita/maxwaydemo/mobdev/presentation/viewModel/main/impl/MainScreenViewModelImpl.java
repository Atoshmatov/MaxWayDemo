package uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.impl;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\b\u00a8\u0006\u0010"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/impl/MainScreenViewModelImpl;", "Landroidx/lifecycle/ViewModel;", "Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/MainScreenViewModel;", "()V", "openBasketScreenLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getOpenBasketScreenLiveData", "()Landroidx/lifecycle/MutableLiveData;", "openHomeScreenLiveData", "getOpenHomeScreenLiveData", "openLoginScreenLiveData", "getOpenLoginScreenLiveData", "openBasketScreen", "openHomeScreen", "openLoginScreen", "app_debug"})
public final class MainScreenViewModelImpl extends androidx.lifecycle.ViewModel implements uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.MainScreenViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> openHomeScreenLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> openBasketScreenLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> openLoginScreenLiveData = null;
    
    public MainScreenViewModelImpl() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getOpenHomeScreenLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getOpenBasketScreenLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.MutableLiveData<kotlin.Unit> getOpenLoginScreenLiveData() {
        return null;
    }
    
    @java.lang.Override()
    public void openHomeScreen() {
    }
    
    @java.lang.Override()
    public void openBasketScreen() {
    }
    
    @java.lang.Override()
    public void openLoginScreen() {
    }
}