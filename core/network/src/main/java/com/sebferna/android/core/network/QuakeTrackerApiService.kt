package com.sebferna.android.core.network

import com.sebferna.android.core.network.model.NetworkEarthQuake
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject
import javax.inject.Singleton

private interface QuakeTrackerApiService {
    @GET("query")
    suspend fun getEarthQuakes(
        @Query("format") format: String = "geojson",
        @Query("starttime") startTime: String,
        @Query("endtime") endTime: String? = null,
        @Query("minmagnitude") minMagnitude: Int? = null,
        @Query("minlatitude") minLatitude: Float,
        @Query("minlongitude") minLongitude: Float,
        @Query("maxlatitude") maxLatitude: Float,
        @Query("maxlongitude") maxLongitude: Float,
        @Query("orderby") orderBy: String? = "time",

        ) : NetworkEarthQuake
}

@Singleton
class EarthQuakeNetwork @Inject constructor(
    private val retrofit: Retrofit
) : QuakeTrackerDataSource {
    private val networkApi: QuakeTrackerApiService by lazy {
        retrofit.create(QuakeTrackerApiService::class.java)
    }

    override suspend fun getEarthQuakes(
        startTime: String,
        endTime: String?,
        minMagnitude: Int?,
        minLongitude: Float,
        minLatitude: Float,
        maxLongitude: Float,
        maxLatitude: Float,
    ): NetworkEarthQuake {
        return networkApi.getEarthQuakes(
            startTime = startTime,
            endTime = endTime,
            minMagnitude = minMagnitude,
            minLatitude = minLatitude,
            minLongitude = minLongitude,
            maxLatitude = maxLatitude,
            maxLongitude = maxLongitude
        )
    }
}


