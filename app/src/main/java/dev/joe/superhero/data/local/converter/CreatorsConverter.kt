package dev.joe.superhero.data.local.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.local.entity.Creator

class CreatorsConverter {

    @TypeConverter
    fun fromString(value: String): List<Creator> {
        val creatorsList = object : TypeToken<List<Creator>>() {}.type
        return Gson().fromJson(value, creatorsList)
    }

    @TypeConverter
    fun fromList(creators: List<Creator>): String {
        return Gson().toJson(creators)
    }

}
