package com.sebferna.android.feature.settings.presentation

import androidx.lifecycle.ViewModel
import com.sebferna.android.core.regions.api.RegionsController
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val regionsController: RegionsController
): ViewModel() {

    fun changeRegion(region: Int) {
        regionsController.changePreferredRegionResource(region)
    }

    fun getCurrentRegionResource(): Int {
        return regionsController.getPreferredRegionResource()
    }
}