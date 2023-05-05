package com.sebferna.android.quaketracker.bottomNavigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.sebferna.android.quaketracker.navigation.Destinations
import com.sebferna.android.core.designsystem.theme.Typography
import com.sebferna.android.core.designsystem.theme.label2

@Composable
fun BottomNavigationBar(
    allScreens: List<Destinations>,
    onTabSelected: (Destinations) -> Unit,
    currentScreen: Destinations
) {
    BottomNavigation() {
        allScreens.forEach { screen ->
            BottomNavigationItem(
                selected = currentScreen == screen,
                onClick = { onTabSelected(screen) },
                label = {
                        Text(
                            text = stringResource(id = screen.title),
                            style = Typography.label2
                        )
                },
                icon = {
                    Icon(painter = painterResource(id = screen.icon), contentDescription = stringResource(id = screen.title))
                }
            )
        }
    }
}