package uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.impl;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001d\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b0\nH\u0016\u00f8\u0001\u0000J\u001d\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b0\nH\u0016\u00f8\u0001\u0000J#\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\f0\u000b0\nH\u0016\u00f8\u0001\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/impl/HomeRepositoryImpl;", "Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/HomeRepository;", "store", "Lcom/google/firebase/firestore/FirebaseFirestore;", "(Lcom/google/firebase/firestore/FirebaseFirestore;)V", "ads", "Lcom/google/firebase/firestore/CollectionReference;", "category", "foods", "getAds", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/AdsModel;", "getCategory", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/CategoryModel;", "getFoods", "Luz/gita/maxwaydemo/mobdev/data/model/mainmodel/home/FoodsModel;", "app_debug"})
public final class HomeRepositoryImpl implements uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.HomeRepository {
    private final com.google.firebase.firestore.CollectionReference ads = null;
    private final com.google.firebase.firestore.CollectionReference category = null;
    private final com.google.firebase.firestore.CollectionReference foods = null;
    
    @javax.inject.Inject()
    public HomeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.FirebaseFirestore store) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.AdsModel>>> getAds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.CategoryModel>>> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.List<java.util.List<uz.gita.maxwaydemo.mobdev.data.model.mainmodel.home.FoodsModel>>>> getFoods() {
        return null;
    }
}