package com.sebferna.android.quaketracker.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sebferna.android.feature.settings.presentation.SettingsScreen
import com.sebferna.android.quaketracker.home.presentation.HomeScreen

@Composable
fun NavigationHost(
    navigationController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = Routes.HOME.name
) {
    NavHost(
        navController = navigationController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(route = Routes.HOME.name) {
            HomeScreen()
        }

        composable(route = Routes.SETTINGS.name) {
            SettingsScreen()
        }
    }
}