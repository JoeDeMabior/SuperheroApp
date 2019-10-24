package dev.joe.superhero.data.remote.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
data class Data<T>(
    @JsonProperty("offset") var offset: Int = 0,
    @JsonProperty("limit") var limit: Int = 0,
    @JsonProperty("total") var total: Int = 0,
    @JsonProperty("count") var count: Int = 0,
    @JsonProperty("results") var results: List<T> = ArrayList()
)
