package com.sebferna.android.feature.home.domain

import com.sebferna.android.feature.home.data.model.NetworkEarthQuake
import com.sebferna.android.feature.home.data.model.NetworkFeature
import com.sebferna.android.feature.home.domain.model.HomeEarthQuake
import com.sebferna.android.feature.home.domain.model.HomeEarthQuakeItem
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun NetworkEarthQuake.mapToHomeModel(): HomeEarthQuake {
    if (metadata?.status == 200) {
        return if (features?.isEmpty() == true) {
            HomeEarthQuake.Empty
        } else if (features == null ) {
            HomeEarthQuake.Error
        } else {
            val items = features.filter {
                it.isDataOk()
            }.map { filteredData ->
                HomeEarthQuakeItem(
                    filteredData.properties?.place.orEmpty(),
                    filteredData.properties?.mag.toString(),
                    filteredData.properties?.time?.toDateString().orEmpty(),
                    filteredData.geometry?.coordinates?.get(0) ?: 0f,
                    filteredData.geometry?.coordinates?.get(1) ?: 0f,
                    filteredData.geometry?.coordinates?.get(2)?.toInt() ?: 0
                )
            }.toList()
            HomeEarthQuake.Success(items)
        }
    } else return HomeEarthQuake.Error
}


fun NetworkFeature.isDataOk(): Boolean {
    return properties?.place != null &&
            properties.mag != null &&
            properties.time != null &&
            !geometry?.coordinates.isNullOrEmpty()
}

fun Long.toDateString(): String? {
    return try {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
        val netDate = Date(this)
        sdf.format(netDate)
    } catch (e: Exception) {
        null
    }
}