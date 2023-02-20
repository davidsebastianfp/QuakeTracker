package com.sebferna.android.quaketracker.navigation

import androidx.navigation.NavHostController

fun NavHostController.navigateSingleTopTo(route: String) = this.navigate(route) {
    launchSingleTop = true
    restoreState = true
}