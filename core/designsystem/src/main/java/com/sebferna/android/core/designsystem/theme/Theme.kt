package com.sebferna.android.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

val DarkColorPalette = darkColors(
    primary = Lime100,
    primaryVariant = Lime700,
    secondary = LightBlue500
)

val LightColorPalette = lightColors(
    primary = Lime500,
    primaryVariant = Lime700,
    secondary = LightBlue500,
    secondaryVariant = LightBlue200,
    background = Lime50,
    surface = Lime50,
    onPrimary = Brown900,
    onSurface = Brown900,
    onBackground = Brown900,
    error = Red700,
    onSecondary = LightBlue900,
)

@Composable
fun QuakeTrackerTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}