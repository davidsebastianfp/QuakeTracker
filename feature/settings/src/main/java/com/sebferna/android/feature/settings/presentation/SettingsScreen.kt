package com.sebferna.android.feature.settings.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.sebferna.android.core.designsystem.SPACING_1
import com.sebferna.android.core.designsystem.SPACING_4
import com.sebferna.android.core.regions.api.regions
import com.sebferna.android.feature.settings.presentation.views.RegionsSpinner
import com.sebferna.android.core.designsystem.theme.Typography
import com.sebferna.android.core.designsystem.theme.caption1

@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier
            .wrapContentSize()
    ) {
        
        val regionsMap = regions.associateBy ({stringResource(id = it)},{ it })
        RegionSelector(
            currentRegion = viewModel.getCurrentRegionResource(), 
            regionsMap = regionsMap, 
            onItemSelected = {
                viewModel.changeRegion(it)    
            }
        )        
    }
}

@Composable
fun RegionSelector(
    currentRegion: Int,
    regionsMap: Map<String, Int>,
    onItemSelected: (Int) -> Unit
) {
    var currentItem: Int by remember { mutableStateOf(currentRegion) }
    Text(
        modifier = Modifier.padding(
            start = SPACING_1,
            top = SPACING_4,
            bottom = SPACING_1
        ),
        text = "Choose your region",
        style = Typography.caption1
    )
    RegionsSpinner(
        availableOptions = regionsMap.keys.toList(),
        selectedItem = stringResource(id = currentItem),
        onItemSelected = { selectedRegion ->
            regionsMap[selectedRegion]?.let {
                onItemSelected(it)
                currentItem = it
            }
        }
    )
}