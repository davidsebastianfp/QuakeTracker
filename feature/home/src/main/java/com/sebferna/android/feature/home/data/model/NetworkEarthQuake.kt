package com.sebferna.android.feature.home.data.model

data class NetworkEarthQuake(
    val metadata: NetworkMetadata? = null,
    val features: List<NetworkFeature>? = null
)