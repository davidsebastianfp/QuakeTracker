package com.sebferna.android.core.regions.di

import android.content.Context
import com.sebferna.android.core.regions.api.RegionsController
import com.sebferna.android.core.regions.impl.RegionsControllerImpl
import com.sebferna.android.core.regions.impl.SharedPreferencesController
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RegionsModule {
    @Provides
    fun provideSharedPreferencesController(
        context: Context
    ): SharedPreferencesController {
        return SharedPreferencesController(context)
    }

    @Provides
    fun bindRegionsController(
        @ApplicationContext context: Context
    ): RegionsController {
        return  RegionsControllerImpl(
            provideSharedPreferencesController(context)
        )
    }
}