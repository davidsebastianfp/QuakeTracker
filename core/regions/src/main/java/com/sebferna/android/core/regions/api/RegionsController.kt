package com.sebferna.android.core.regions.api

interface RegionsController {
    fun getPreferredRegionRectangleOrDefault(): Map<String, Float>
    fun getPreferredRegionResource(): Int
    fun changePreferredRegionResource(resource: Int)
}