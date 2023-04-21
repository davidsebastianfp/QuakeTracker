package com.sebferna.android.core.designsystem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.sebferna.android.core.designsystem.theme.HardEarthQuaKe
import com.sebferna.android.core.designsystem.theme.MediumEarthQuake
import com.sebferna.android.core.designsystem.theme.SoftEarthQuake
import com.sebferna.android.core.designsystem.theme.Typography
import com.sebferna.android.core.designsystem.theme.caption3

@Composable
fun MagnitudeView(
    magnitude: String,
    modifier: Modifier = Modifier
) {
    val mag = magnitude.toFloat()
    val color = when {
        mag <= 3f -> SoftEarthQuake
        mag <= 5f -> MediumEarthQuake
        else -> HardEarthQuaKe
    }
        Text(
            text = magnitude,
            style = Typography.caption3,
            textAlign = TextAlign.Center,
            modifier = modifier
                .wrapContentHeight()
                .width(VIEW_SIZE_48)
                .background(
                    shape = RoundedCornerShape(RADIUS_10),
                    color = color
                )
                .padding(SPACING_2),
            color = Color.White
        )
}


@Preview
@Composable
fun MagnitudeViewPreview() {
    MagnitudeView(magnitude = "5.4")
}