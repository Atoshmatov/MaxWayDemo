package uz.gita.maxwaydemo.mobdev.di.maindi.home

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.HomeRepository
import uz.gita.maxwaydemo.mobdev.domain.mainrepository.home.impl.HomeRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface HomeRepositoryModule {
    @[Binds Singleton]
    fun bindHomeRepository(impl: HomeRepositoryImpl): HomeRepository
}