package uz.gita.maxwaydemo.mobdev.presentation.views.screen.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006!"}, d2 = {"Luz/gita/maxwaydemo/mobdev/presentation/views/screen/main/home/HomeScreen;", "Landroidx/fragment/app/Fragment;", "()V", "adsAdapter", "Luz/gita/maxwaydemo/mobdev/presentation/views/adapter/mainadapter/home/AdsAdapter;", "adsObserver", "Landroidx/lifecycle/Observer;", "", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "binding", "Luz/gita/maxwaydemo/mobdev/databinding/ScreenHomeBinding;", "getBinding", "()Luz/gita/maxwaydemo/mobdev/databinding/ScreenHomeBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/ViewBindingProperty;", "categoryAdapter", "Luz/gita/maxwaydemo/mobdev/presentation/views/adapter/mainadapter/home/CategoryAdapter;", "categoryObserver", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/CategoryModel;", "changeAdsObserver", "", "viewModel", "Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/home/HomeScreenViewModel;", "getViewModel", "()Luz/gita/maxwaydemo/mobdev/presentation/viewModel/main/home/HomeScreenViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class HomeScreen extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    private final by.kirich1409.viewbindingdelegate.ViewBindingProperty binding$delegate = null;
    private final uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.AdsAdapter adsAdapter = null;
    private final uz.gita.maxwaydemo.mobdev.presentation.views.adapter.mainadapter.home.CategoryAdapter categoryAdapter = null;
    private final androidx.lifecycle.Observer<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel>> adsObserver = null;
    private final androidx.lifecycle.Observer<java.lang.Integer> changeAdsObserver = null;
    private final androidx.lifecycle.Observer<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel>> categoryObserver = null;
    
    public HomeScreen() {
        super();
    }
    
    private final uz.gita.maxwaydemo.mobdev.presentation.viewModel.main.home.HomeScreenViewModel getViewModel() {
        return null;
    }
    
    private final uz.gita.maxwaydemo.mobdev.databinding.ScreenHomeBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}