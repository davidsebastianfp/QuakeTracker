package com.sebferna.android.quaketracker.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.sebferna.android.quaketracker.R

val mintSansFamily = FontFamily(
    Font(R.font.mint_sans_bold, FontWeight.Bold),
    Font(R.font.mint_sans_regular, FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    mintSansFamily,
    body1 = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)

val Typography.label1: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 9.sp
    )

val Typography.label2: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 9.sp
    )
val Typography.header6: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )

val Typography.subtitle: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    )

val Typography.caption1: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

val Typography.caption2: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

val Typography.caption3: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp
    )

val Typography.caption4: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )

val Typography.caption5: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )

val Typography.caption6: TextStyle
    get() = TextStyle(
        fontFamily = mintSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 12.sp
    )