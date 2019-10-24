package dev.joe.superhero.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.structure.Url

class UrlsConverter {

    @TypeConverter
    fun fromString(value: String): ArrayList<Url> {
        val urlsList = object : TypeToken<ArrayList<Url>>() {}.type
        return Gson().fromJson(value, urlsList)
    }

    @TypeConverter
    fun fromArrayList(urls: ArrayList<Url>): String {
        return Gson().toJson(urls)
    }

}
