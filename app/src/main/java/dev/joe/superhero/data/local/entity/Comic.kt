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

@Entity(tableName = "comics", primaryKeys = ["id"])
data class Comic(
    @SerializedName("id")
    @Expose
    val id: Long,

    @SerializedName("digitalId")
    @Expose
    val digitalId: Long,

    @SerializedName("title")
    @Expose
    val title: String,

    @SerializedName("issueNumber")
    @Expose
    val issueNumber: Int,

    @SerializedName("variantDescription")
    @Expose
    val variantDescription: String?,

    @SerializedName("description")
    @Expose
    val description: String?,

    @SerializedName("modified")
    @Expose
    val modified: Date?,

    @SerializedName("isbn")
    @Expose
    val isbn: String?,

    @SerializedName("upc")
    @Expose
    val upc: String?,

    @SerializedName("diamondCode")
    @Expose
    val diamondCode: String?,

    @SerializedName("ean")
    @Expose
    val ean: String?,

    @SerializedName("issn")
    @Expose
    val issn: String?,

    @SerializedName("format")
    @Expose
    val format: String?,

    @SerializedName("pageCount")
    @Expose
    val pageCount: Int,

    @SerializedName("resourceURI")
    @Expose
    val resourceUri: String?,

    @SerializedName("urls")
    @Expose
    @TypeConverters(UrlsConverter::class)
    val urls: ArrayList<Url>?,

    @SerializedName("thumbnail")
    val thumbnail: Image?,

    @SerializedName("images")
    @TypeConverters(ImagesConverter::class)
    val images: ArrayList<Image>?,

    @SerializedName("creators")
    @Expose
    @TypeConverters(CreatorsConverter::class)
    val creators: List<Creator>?,

    @SerializedName("events")
    @Expose
    @TypeConverters(EventsConverter::class)
    val events: List<Event>?,

    @SerializedName("characters")
    @Expose
    @TypeConverters(CharactersConverter::class)
    val characters: List<Character>?,

    @SerializedName("stories")
    @Expose
    @TypeConverters(StoriesConverter::class)
    val stories: List<Stories>?
)
