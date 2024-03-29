package com.sebferna.android.feature.home.presentation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sebferna.android.core.designsystem.MagnitudeView
import com.sebferna.android.core.designsystem.SPACING_2
import com.sebferna.android.core.designsystem.SPACING_4
import com.sebferna.android.core.designsystem.theme.QuakeTrackerTheme
import com.sebferna.android.core.designsystem.theme.Typography
import com.sebferna.android.core.designsystem.theme.caption1
import com.sebferna.android.core.designsystem.theme.caption5
import com.sebferna.android.feature.home.domain.model.HomeEarthQuakeItem

@Composable
fun EarthQuakeItem(
    modifier: Modifier = Modifier,
    data: HomeEarthQuakeItem
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(SPACING_4),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(
            horizontal = 0.dp,
            vertical = SPACING_2
        )
    ) {
        MagnitudeView(
            data.mag,
            modifier = modifier
        )
        Column(
            modifier = modifier.wrapContentWidth()
        ) {
            Text(
                text = data.place,
                style = Typography.caption1
            )
            Text(
                text = data.date,
                style = Typography.caption5
            )
        }
    }
}

@Preview
@Composable
private fun EarthQuakeItemView() {
    QuakeTrackerTheme {
        Surface {
            EarthQuakeItem(
                data = HomeEarthQuakeItem(
                    "Some place in the world",
                    "5.4",
                    "12-20-2022",
                    150.2f,
                    90f,
                    100
                )
            )
        }
    }
}