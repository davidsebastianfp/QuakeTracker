package com.sebferna.android.core.network.model

data class NetworkFeature(
    val type: String? = null,
    val properties: FeatureProperties? = null,
    val geometry: NetworkGeometry? = null
)

data class FeatureProperties(
    val mag: Float? = null,
    val place: String? = null,
    val time: Long? = null,
    val updated: Long? = null,
    val tz: Int? = null,
    val url: String? = null,
    val detail: String? = null,
    val felt:Int? = null,
    val cdi: Float? = null,
    val mmi: Float? = null,
    val alert: String? = null,
    val status: String? = null,
    val tsunami: Int? = null,
    val sig:Int? = null,
    val net: String? = null,
    val code: String? = null,
    val ids: String? = null,
    val sources: String? = null,
    val types: String? = null,
    val nst: Int? = null,
    val dmin: Float? = null,
    val rms: Float? = null,
    val gap: Float? = null,
    val magType: String? = null,
    val type: String? = null
)
