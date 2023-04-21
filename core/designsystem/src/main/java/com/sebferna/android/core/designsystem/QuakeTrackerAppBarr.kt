package com.sebferna.android.core.designsystem

import androidx.annotation.StringRes
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.sebferna.android.core.designsystem.theme.Typography
import com.sebferna.android.core.designsystem.theme.subtitle

@Composable
fun QuakeTrackerTopBar(
    @StringRes titleRes: Int
) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(
                    id = titleRes,
                ),
                style = Typography.subtitle,
            )
        }
    )
}