package dev.joe.superhero.data.local.entity

import androidx.room.Entity
import androidx.room.TypeConverters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import dev.joe.superhero.data.local.converter.*
import dev.joe.superhero.data.local.structure.Image
import java.util.*

@Entity(tableName = "stories", primaryKeys = ["id"])
data class Stories(
    @SerializedName("id")
    @Expose
    val id: Long,

    @SerializedName("title")
    @Expose
    val title: String,

    @SerializedName("description")
    @Expose
    val description: String?,

    @SerializedName("resourceURI")
    @Expose
    val resourceUri: String?,

    @SerializedName("type")
    @Expose
    val type: String?,

    @SerializedName("modified")
    @Expose
    val modified: Date?,

    @SerializedName("thumbnail")
    val thumbnail: Image?,

    @SerializedName("comics")
    @Expose
    @TypeConverters(ComicsConverter::class)
    val comics: List<Comic>?,

    @SerializedName("series")
    @Expose
    @TypeConverters(SeriesConverter::class)
    val series: List<Series>?,

    @SerializedName("events")
    @Expose
    @TypeConverters(EventsConverter::class)
    val events: List<Event>?,

    @SerializedName("characters")
    @Expose
    @TypeConverters(CharactersConverter::class)
    val characters: List<Character>?,

    @SerializedName("creators")
    @Expose
    @TypeConverters(CreatorsConverter::class)
    val creator: List<Creator>?
)
