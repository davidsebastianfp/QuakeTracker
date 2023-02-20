package com.sebferna.android.quaketracker.core.regions

import com.sebferna.android.quaketracker.R
import com.sebferna.android.quaketracker.core.sharedpreferences.SharedPreferencesController
import com.sebferna.android.quaketracker.core.sharedpreferences.SharedPreferencesController.Companion.DEFAULT_INT_VALUE
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegionsController @Inject constructor(
    private val sharedPreferencesController: SharedPreferencesController
) {
   fun getPreferredRegionRectangleOrDefault(): Map<String, Float> {
       return when (sharedPreferencesController.getPreferredRegion()) {
           R.string.south_america -> south_america_rectangle
           R.string.europe -> europe_rectangle
           R.string.asia -> asia_rectangle
           R.string.africa -> africa_rectangle
           R.string.oceania -> oceania_rectangle
           else -> north_america_rectangle
       }
   }

    fun getPreferredRegionResource(): Int {
        val currentRegion = sharedPreferencesController.getPreferredRegion()
        return if (currentRegion != null && currentRegion != DEFAULT_INT_VALUE) {
            currentRegion
        } else {
            R.string.north_america
        }

    }

    fun changePreferredRegionResource(resource: Int) {
        sharedPreferencesController.setPreferredRegion(resource)
    }
}