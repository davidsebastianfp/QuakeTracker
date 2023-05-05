package com.sebferna.android.feature.home.domain

import com.sebferna.android.feature.home.data.HomeRepository
import com.sebferna.android.feature.home.domain.model.HomeEarthQuake
import javax.inject.Inject

class GetEarthQuakesUseCase @Inject constructor(
    private val repository: HomeRepository
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
        return repository.getEarthQuakesFromSource(
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