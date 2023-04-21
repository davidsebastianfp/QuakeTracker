package com.sebferna.android.quaketracker.home.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import com.sebferna.android.core.designsystem.EarthQuakeItem
import com.sebferna.android.core.designsystem.SPACING_4
import com.sebferna.android.quaketracker.R
import com.sebferna.android.quaketracker.home.data.model.HomeEarthQuake
import com.sebferna.android.core.designsystem.theme.Typography
import com.sebferna.android.core.designsystem.theme.header6


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    when (val earthQuake = viewModel.earthQuake.observeAsState().value) {
        is HomeEarthQuake.Success -> {
            LazyColumn(
                modifier = modifier.padding(horizontal = SPACING_4)
            ) {
                earthQuake.earthQuakes.forEach {
                    item {
                        EarthQuakeItem(data = it)
                        Divider()
                    }
                }
            }
        }
        is HomeEarthQuake.Loading -> {
            ScreenPlaceholder(strResource = R.string.fetching_data)
        }
        is HomeEarthQuake.Empty -> {
            ScreenPlaceholder(strResource = R.string.earth_quakes_list_empty)
        }
        else -> {
            ScreenPlaceholder(strResource = R.string.error_fetching_data)
        }
    }
}

@Composable
private fun ScreenPlaceholder(strResource: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = stringResource(id = strResource),
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = Typography.header6
        )
    }
}