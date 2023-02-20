package com.sebferna.android.quaketracker.core.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class SharedPreferencesController @Inject constructor(
    @ApplicationContext appContext: Context
) {
    private var sharedPreferences: SharedPreferences? = null
    companion object {
        const val PREFERENCES_KEY = "com.sebferna.android.quaketracker.SharedPreferencesKey"
        const val DEFAULT_INT_VALUE = -1
        private const val PREFERRED_REGION_KEY = "prefered_region"
    }

    init {
        sharedPreferences = appContext.getSharedPreferences(PREFERENCES_KEY, Context.MODE_PRIVATE)
    }
    fun getPreferredRegion(): Int? {
        return sharedPreferences?.getInt(PREFERRED_REGION_KEY, DEFAULT_INT_VALUE)
    }

    fun setPreferredRegion(region: Int) {
        with(sharedPreferences?.edit()) {
            this?.putInt(PREFERRED_REGION_KEY, region)
            this?.apply()
        }
    }
}