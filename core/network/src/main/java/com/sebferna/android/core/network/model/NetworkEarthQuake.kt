package com.sebferna.android.core.network.model

data class NetworkEarthQuake(
    val metadata: NetworkMetadata? = null,
    val features: List<NetworkFeature>? = null
)