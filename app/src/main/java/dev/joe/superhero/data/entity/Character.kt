package dev.joe.superhero.data.entity

import androidx.room.Entity
import androidx.room.TypeConverters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import dev.joe.superhero.converter.*
import dev.joe.superhero.data.structure.Image
import dev.joe.superhero.data.structure.Url
import java.util.*
import kotlin.collections.ArrayList

@Entity(tableName = "characters", primaryKeys = ["id"])
data class Character(
    @SerializedName("id")
    @Expose
    val id: Long,

    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("description")
    @Expose
    val description: String?,

    @SerializedName("modified")
    @Expose
    val modified: Date?,

    @SerializedName("resourceURI")
    @Expose
    val resourceUri: String?,

    @SerializedName("urls")
    @Expose
    @TypeConverters(UrlsConverter::class)
    val urls: ArrayList<Url>?,

    @SerializedName("thumbnail")
    @Expose
    val thumbnail: Image?,

    @SerializedName("comics")
    @Expose
    @TypeConverters(ComicsConverter::class)
    val comics: List<Comic>?,

    @SerializedName("events")
    @Expose
    @TypeConverters(EventsConverter::class)
    val events: List<Event>?,

    @SerializedName("series")
    @Expose
    @TypeConverters(SeriesConverter::class)
    val series: List<Series>?,

    @SerializedName("stories")
    @Expose
    @TypeConverters(StoriesConverter::class)
    val stories: List<Stories>?
)
