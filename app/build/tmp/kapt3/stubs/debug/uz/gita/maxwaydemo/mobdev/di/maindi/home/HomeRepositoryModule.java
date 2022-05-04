package uz.gita.maxwaydemo.mobdev.di.maindi.home;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Luz/gita/maxwaydemo/mobdev/di/maindi/home/HomeRepositoryModule;", "", "bindHomeRepository", "Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/HomeRepository;", "impl", "Luz/gita/maxwaydemo/mobdev/domain/mainrepository/home/impl/HomeRepositoryImpl;", "app_debug"})
@dagger.Module()
public abstract interface HomeRepositoryModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.HomeRepository bindHomeRepository(@org.jetbrains.annotations.NotNull()
    uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.impl.HomeRepositoryImpl impl);
}