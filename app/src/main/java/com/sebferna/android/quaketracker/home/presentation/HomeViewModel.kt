package com.sebferna.android.quaketracker.home.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sebferna.android.quaketracker.core.date.DateFormatter
import com.sebferna.android.quaketracker.core.regions.RegionsController
import com.sebferna.android.quaketracker.home.data.HomeRepository
import com.sebferna.android.quaketracker.home.data.model.HomeEarthQuake
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val homeRepository: HomeRepository,
    private val dateFormatter: DateFormatter,
    private val regionsController: RegionsController
): ViewModel() {
    private val _earthQuakes = MutableLiveData<HomeEarthQuake>()
    val earthQuake: LiveData<HomeEarthQuake> = _earthQuakes

    private val preferredRectangle by lazy {
        regionsController.getPreferredRegionRectangleOrDefault()
    }

    init {
        getNearbyEarthQuakes()
    }

    private fun getNearbyEarthQuakes() {
        viewModelScope.launch {
            _earthQuakes.value = HomeEarthQuake.Loading

            try {
                val date = dateFormatter.getTodaysDateFormatted()
                _earthQuakes.value = homeRepository.getEarthQuakesFromSource(
                    date,
                    minLongitude = preferredRectangle["min_lng"]!!,
                    minLatitude = preferredRectangle["min_lat"]!!,
                    maxLongitude = preferredRectangle["max_lng"]!!,
                    maxLatitude = preferredRectangle["max_lat"]!!
                )

            } catch (e: Exception) {
                _earthQuakes.value = HomeEarthQuake.Error
            }
        }
    }
}