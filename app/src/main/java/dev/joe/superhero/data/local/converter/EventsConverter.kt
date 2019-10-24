package dev.joe.superhero.data.local.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.local.entity.Event

class EventsConverter {

    @TypeConverter
    fun fromString(value: String): List<Event> {
        val eventsList = object : TypeToken<List<Event>>() {}.type
        return Gson().fromJson(value, eventsList)
    }

    @TypeConverter
    fun fromList(events: List<Event>): String {
        return Gson().toJson(events)
    }

}
