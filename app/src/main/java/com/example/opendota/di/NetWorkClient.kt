package com.example.opendota.di

import com.example.opendota.data.remote.NetWorkClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkClient {

    @Singleton
    @Provides
    fun provideHeroesApiService(netWorkClient: NetWorkClient) =
        netWorkClient.provideHeroesApiService()
}