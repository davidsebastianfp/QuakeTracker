package com.sebferna.android.quaketracker.core.regions

import com.sebferna.android.quaketracker.R


val south_america_rectangle: Map<String, Float> = mapOf(
    "min_lat" to -50f,
    "min_lng" to -90f,
    "max_lat" to 10f,
    "max_lng" to -30f,
)

val north_america_rectangle: Map<String, Float> = mapOf(
    "min_lat" to 10f,
    "min_lng" to -180f,
    "max_lat" to 90f,
    "max_lng" to -10f,
)

val europe_rectangle: Map<String, Float> = mapOf(
    "min_lat" to 30f,
    "min_lng" to -20f,
    "max_lat" to 70f,
    "max_lng" to 60f,
)

val asia_rectangle: Map<String, Float> = mapOf(
    "min_lat" to -10f,
    "min_lng" to 25f,
    "max_lat" to 80f,
    "max_lng" to 180f,
)

val africa_rectangle: Map<String, Float> = mapOf(
    "min_lat" to -30f,
    "min_lng" to -20f,
    "max_lat" to 40f,
    "max_lng" to 50f,
)

val oceania_rectangle: Map<String, Float> = mapOf(
    "min_lat" to -50f,
    "min_lng" to 110f,
    "max_lat" to 0f,
    "max_lng" to 180f,
)

val regions = listOf(
    R.string.north_america,
    R.string.south_america,
    R.string.europe,
    R.string.asia,
    R.string.africa,
    R.string.oceania
)