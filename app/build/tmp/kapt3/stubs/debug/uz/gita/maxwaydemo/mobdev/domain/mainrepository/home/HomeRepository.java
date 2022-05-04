package uz.gita.maxwaydemo.mobdev.domain.mainrepository.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H&\u00f8\u0001\u0000J\u001d\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u0003H&\u00f8\u0001\u0000J#\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00050\u00040\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/HomeRepository;", "", "getAds", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "getCategory", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/CategoryModel;", "getFoods", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/FoodsModel;", "app_debug"})
public abstract interface HomeRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel>>> getAds();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel>>> getCategory();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel>>>> getFoods();
}