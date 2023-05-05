package com.sebferna.android.feature.home.data.model


data class NetworkGeometry(
    val type: String? = null,
    val coordinates: List<Float>? = null // lng, lat, depth
)
