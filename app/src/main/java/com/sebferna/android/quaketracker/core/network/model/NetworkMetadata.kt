package com.sebferna.android.quaketracker.core.network.model

data class NetworkMetadata(
    val generated: Long? = null,
    val url: String? = null,
    val title: String? = null,
    val api: String? = null,
    val count: Int? = null,
    val status: Int? = null,
)