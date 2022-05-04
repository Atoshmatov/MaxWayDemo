package uz.gita.maxwaydemo.mobdev.domain.mainrepository.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J,\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/HomeRepository;", "", "getAds", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategory", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/CategoryModel;", "getFoods", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/FoodsModel;", "app_debug"})
public abstract interface HomeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAds(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCategory(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel>>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFoods(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<? extends java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel>>>>> continuation);
}