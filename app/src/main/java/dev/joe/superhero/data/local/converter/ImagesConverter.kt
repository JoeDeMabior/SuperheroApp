package dev.joe.superhero.data.local.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.local.structure.Image

class ImagesConverter {

    @TypeConverter
    fun fromString(value: String): ArrayList<Image> {
        val imagesList = object : TypeToken<ArrayList<Image>>() {}.type
        return Gson().fromJson(value, imagesList)
    }

    @TypeConverter
    fun fromArrayList(images: ArrayList<Image>): String {
        return Gson().toJson(images)
    }

}
