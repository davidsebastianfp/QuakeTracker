package com.sebferna.android.core.regions.impl

import com.sebferna.android.core.regions.api.RegionsController
import com.sebferna.android.core.regions.api.africa_rectangle
import com.sebferna.android.core.regions.api.asia_rectangle
import com.sebferna.android.core.regions.api.europe_rectangle
import com.sebferna.android.core.regions.api.north_america_rectangle
import com.sebferna.android.core.regions.api.oceania_rectangle
import com.sebferna.android.core.regions.api.south_america_rectangle
import com.sebferna.android.core.regions.impl.SharedPreferencesController.Companion.DEFAULT_INT_VALUE
import com.sebferna.android.core.regions.R
import javax.inject.Inject

class RegionsControllerImpl @Inject constructor(
    private val sharedPreferencesController: SharedPreferencesController
): RegionsController {
   override fun getPreferredRegionRectangleOrDefault(): Map<String, Float> {
       return when (sharedPreferencesController.getPreferredRegion()) {
           R.string.south_america -> south_america_rectangle
           R.string.europe -> europe_rectangle
           R.string.asia -> asia_rectangle
           R.string.africa -> africa_rectangle
           R.string.oceania -> oceania_rectangle
           else -> north_america_rectangle
       }
   }

    override fun getPreferredRegionResource(): Int {
        val currentRegion = sharedPreferencesController.getPreferredRegion()
        return if (currentRegion != null && currentRegion != DEFAULT_INT_VALUE) {
            currentRegion
        } else {
            R.string.north_america
        }

    }

    override fun changePreferredRegionResource(resource: Int) {
        sharedPreferencesController.setPreferredRegion(resource)
    }
}