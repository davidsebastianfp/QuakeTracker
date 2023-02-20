package com.sebferna.android.quaketracker.core.network.model

data class NetworkEarthQuake(
    val metadata: NetworkMetadata? = null,
    val features: List<NetworkFeature>? = null
)