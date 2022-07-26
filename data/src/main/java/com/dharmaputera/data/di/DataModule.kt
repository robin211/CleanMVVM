package com.dharmaputera.data.di

import com.dharmaputera.data.api.NYTimesApi
import com.dharmaputera.data.repository.BookRepositoryImpl
import com.dharmaputera.domain.common.Constants.BASE_URL
import com.dharmaputera.domain.repository.BookRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideNYTimesApi(): NYTimesApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NYTimesApi::class.java)
    }

    @Provides
    @Singleton
    fun provideBookRepository(api: NYTimesApi): BookRepository {
        return BookRepositoryImpl(api)
    }
}