package com.sebferna.android.core.network.di

import com.sebferna.android.core.network.EarthQuakeNetwork
import com.sebferna.android.core.network.QuakeTrackerDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class QuakeTrackerDataSourceProvider {

    @Binds
    abstract fun bindEarthQuakeNetwork(
        earthQuakeNetwork: EarthQuakeNetwork
    ): QuakeTrackerDataSource
}