package com.sebferna.android.quaketracker.core.network

import com.sebferna.android.quaketracker.core.network.model.NetworkEarthQuake

interface QuakeTrackerDataSource {
    suspend fun getEarthQuakes(
        startTime: String,
        endTime: String? = null,
        minMagnitude: Int? = null,
        minLongitude: Float,
        minLatitude: Float,
        maxLongitude: Float,
        maxLatitude: Float,
    ) : NetworkEarthQuake
}