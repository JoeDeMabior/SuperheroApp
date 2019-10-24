package dev.joe.superhero.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.entity.Stories

class StoriesConverter {

    @TypeConverter
    fun fromString(value: String): List<Stories> {
        val storiesList = object : TypeToken<List<Stories>>() {}.type
        return Gson().fromJson(value, storiesList)
    }

    @TypeConverter
    fun fromList(storiesList: List<Stories>): String {
        return Gson().toJson(storiesList)
    }

}
