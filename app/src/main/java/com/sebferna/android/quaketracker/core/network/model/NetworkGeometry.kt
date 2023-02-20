package com.sebferna.android.quaketracker.core.network.model

data class NetworkGeometry(
    val type: String? = null,
    val coordinates: List<Float>? = null // lng, lat, depth
)
