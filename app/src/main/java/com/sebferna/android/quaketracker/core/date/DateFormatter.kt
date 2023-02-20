package com.sebferna.android.quaketracker.core.date

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter.ofPattern
import javax.inject.Inject


class DateFormatter @Inject constructor() {
    fun getTodaysDateFormatted(): String {
        val formatter = ofPattern("yyyy-MM-dd")
        return LocalDateTime.now().format(formatter)
    }
}