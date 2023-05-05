package com.sebferna.android.feature.home.data

import com.sebferna.android.feature.home.data.model.NetworkEarthQuake
import retrofit2.http.GET
import retrofit2.http.Query

interface HomeService {
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