package com.sebferna.android.core.commons

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter.ofPattern
import javax.inject.Inject


class DateFormatter @Inject constructor() {
    fun getTodaysDateFormatted(): String {
        val formatter = ofPattern("yyyy-MM-dd'T'HH:mm:ss")
        return LocalDateTime.now().format(formatter)
    }
}