package dev.joe.superhero.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.entity.Series

class SeriesConverter {

    @TypeConverter
    fun fromString(value: String): List<Series> {
        val seriesList = object : TypeToken<List<Series>>() {}.type
        return Gson().fromJson(value, seriesList)
    }

    @TypeConverter
    fun fromList(seriesList: List<Series>): String {
        return Gson().toJson(seriesList)
    }

}
