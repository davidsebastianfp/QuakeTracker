package com.sebferna.android.feature.home.data

import com.sebferna.android.feature.home.data.model.NetworkEarthQuake
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val service: HomeService
) {
    suspend fun getEarthQuakesFromSource(
        starTime: String,
        endTime: String? = null,
        minMagnitude: Int? = null,
        minLongitude: Float,
        minLatitude: Float,
        maxLongitude: Float,
        maxLatitude: Float,
    ): NetworkEarthQuake {
        return service.getEarthQuakes(
            startTime = starTime,
            endTime = endTime,
            minMagnitude = minMagnitude,
            minLongitude = minLongitude,
            minLatitude = minLatitude,
            maxLongitude = maxLongitude,
            maxLatitude = maxLatitude
        )
    }
}