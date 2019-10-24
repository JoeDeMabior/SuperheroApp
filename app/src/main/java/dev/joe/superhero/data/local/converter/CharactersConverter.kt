package dev.joe.superhero.data.local.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dev.joe.superhero.data.local.entity.Character

class CharactersConverter {

    @TypeConverter
    fun fromString(value: String): List<Character> {
        val charactersType = object : TypeToken<List<Character>>() {}.type
        return Gson().fromJson(value, charactersType)
    }

    @TypeConverter
    fun fromList(characters: List<Character>): String {
        return Gson().toJson(characters)
    }

}
