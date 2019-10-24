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

@Entity(tableName = "creators", primaryKeys = ["id"])
data class Creator(
    @SerializedName("id")
    @Expose
    val id: Long,

    @SerializedName("firstName")
    @Expose
    val firstName: String,

    @SerializedName("middleName")
    @Expose
    val middleName: String?,

    @SerializedName("lastName")
    @Expose
    val lastName: String,

    @SerializedName("suffix")
    @Expose
    val suffix: String,

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
