package dev.joe.superhero.data.local.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.local.entity.Comic

class ComicsConverter {

    @TypeConverter
    fun fromString(value: String): List<Comic> {
        val comicsList = object : TypeToken<List<Comic>>() {}.type
        return Gson().fromJson(value, comicsList)
    }

    @TypeConverter
    fun fromList(comics: List<Comic>): String {
        return Gson().toJson(comics)
    }

}
