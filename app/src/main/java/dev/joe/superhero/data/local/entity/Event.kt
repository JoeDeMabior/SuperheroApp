package dev.joe.superhero.data.local.entity

import androidx.room.Entity
import androidx.room.TypeConverters
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import dev.joe.superhero.data.local.converter.*
import dev.joe.superhero.data.local.structure.Image
import dev.joe.superhero.data.local.structure.Url
import java.util.*
import kotlin.collections.ArrayList

@Entity(tableName = "events", primaryKeys = ["id"])
data class Event(
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

    @SerializedName("urls")
    @Expose
    @TypeConverters(UrlsConverter::class)
    val urls: ArrayList<Url>?,

    @SerializedName("modified")
    @Expose
    val modified: Date?,

    @SerializedName("start")
    @Expose
    val start: Date?,

    @SerializedName("end")
    @Expose
    val end: Date?,

    @SerializedName("thumbnail")
    val thumbnail: Image?,

    @SerializedName("comics")
    @Expose
    @TypeConverters(ComicsConverter::class)
    val comics: List<Comic>?,

    @SerializedName("characters")
    @Expose
    @TypeConverters(CharactersConverter::class)
    val characters: List<Character>?,

    @SerializedName("creators")
    @Expose
    @TypeConverters(CreatorsConverter::class)
    val creators: List<Creator>?,

    @SerializedName("stories")
    @Expose
    @TypeConverters(StoriesConverter::class)
    val stories: List<Stories>?,

    @SerializedName("series")
    @Expose
    @TypeConverters(SeriesConverter::class)
    val series: List<Series>?
)
