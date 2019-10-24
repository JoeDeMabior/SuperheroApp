package dev.joe.superhero.data.structure

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class Image(
    @SerializedName("path")
    @Expose
    val path: String,

    @SerializedName("extension")
    @Expose
    val extension: String
) {
    @JsonIgnore
    val imageUrl = "$path.$extension"

    @JsonIgnore
    val isDefaultImage = path.endsWith("image_not_available", ignoreCase = true)
}
