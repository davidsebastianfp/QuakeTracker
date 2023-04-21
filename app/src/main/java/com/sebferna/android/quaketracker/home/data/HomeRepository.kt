package com.sebferna.android.quaketracker.home.data

import com.sebferna.android.core.network.QuakeTrackerDataSource
import com.sebferna.android.quaketracker.home.data.model.HomeEarthQuake
import javax.inject.Inject

class HomeRepository @Inject constructor(
    private val service: QuakeTrackerDataSource
) {
    suspend fun getEarthQuakesFromSource(
        starTime: String,
        endTime: String? = null,
        minMagnitude: Int? = null,
        minLongitude: Float,
        minLatitude: Float,
        maxLongitude: Float,
        maxLatitude: Float,
    ): HomeEarthQuake {
        return service.getEarthQuakes(
            starTime,
            endTime,
            minMagnitude,
            minLongitude,
            minLatitude,
            maxLongitude,
            maxLatitude
        ).mapToHomeModel()
    }
}