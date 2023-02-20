package com.sebferna.android.quaketracker.navigation

import com.sebferna.android.quaketracker.R

sealed class Destinations (var title:Int, var icon:Int, var screen_route:String) {
    companion object {
        val bottomNavigationScreens = listOf(
            Home,
            Settings
        )
    }
    object Home : Destinations(R.string.home, R.drawable.ds_ic_home_black_24dp, Routes.HOME.name)
    object Settings : Destinations(R.string.settings, R.drawable.ds_ic_settings_black_24dp, Routes.SETTINGS.name)
}