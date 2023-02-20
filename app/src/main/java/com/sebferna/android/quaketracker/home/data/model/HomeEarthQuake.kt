package com.sebferna.android.quaketracker.home.data.model

sealed class HomeEarthQuake {
    data class Success(
        val earthQuakes: List<HomeEarthQuakeItem>
    ) : HomeEarthQuake()

    object Empty: HomeEarthQuake()
    object Loading: HomeEarthQuake()
    object Error: HomeEarthQuake()
}

data class HomeEarthQuakeItem(
    val place: String,
    val mag: String,
    val date: String,
    val lng: Float,
    val lat: Float,
    val depth: Int
) : HomeEarthQuake()

