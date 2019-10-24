package dev.joe.superhero.converter

import android.text.format.DateFormat
import androidx.room.TypeConverter
import java.util.*

class DateConverter {

    @TypeConverter
    fun toDate(timestamp: Long?) = if (timestamp == null) null else Date(timestamp)

    @TypeConverter
    fun toTimestamp(date: Date?) = date?.time

    companion object {
        fun dateFormat(date: Date): String {
            return DateFormat.format("MMM dd, yyyy", date) as String
        }
    }

}
