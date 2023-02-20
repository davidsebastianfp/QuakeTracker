package com.sebferna.android.quaketracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.sebferna.android.quaketracker.bottomNavigation.BottomNavigationBar
import com.sebferna.android.quaketracker.designsystem.QuakeTrackerTopBar
import com.sebferna.android.quaketracker.navigation.Destinations.Home
import com.sebferna.android.quaketracker.navigation.Destinations.Companion.bottomNavigationScreens
import com.sebferna.android.quaketracker.navigation.NavigationHost
import com.sebferna.android.quaketracker.navigation.navigateSingleTopTo
import com.sebferna.android.quaketracker.ui.theme.DarkColorPalette
import com.sebferna.android.quaketracker.ui.theme.LightColorPalette
import com.sebferna.android.quaketracker.ui.theme.QuakeTrackerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            if (isSystemInDarkTheme()) {
                this.window.navigationBarColor = DarkColorPalette.primary.toArgb()
                this.window.statusBarColor = DarkColorPalette.primary.toArgb()
            } else {
                this.window.navigationBarColor = LightColorPalette.primary.toArgb()
                this.window.statusBarColor = LightColorPalette.primary.toArgb()
            }
            QuakeTrackerApp()
        }
    }
}

@Composable
fun QuakeTrackerApp() {
    QuakeTrackerTheme {
        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination

        val currentScreen = bottomNavigationScreens.find {
            it.screen_route == currentDestination?.route
        } ?: Home

        Scaffold(
            topBar = {
                val barTitle = if (currentScreen == Home) R.string.recentEarthquakes else currentScreen.title
                QuakeTrackerTopBar(titleRes = barTitle)
            },
            bottomBar = {
                BottomNavigationBar(
                    allScreens = bottomNavigationScreens,
                    onTabSelected = {
                        navController.navigateSingleTopTo(it.screen_route)
                    },
                    currentScreen = currentScreen)
            }
        ) {
            NavigationHost(
                navigationController = navController,
                modifier = Modifier.padding(it)
            )
        }
    }
}