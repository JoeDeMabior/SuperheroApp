package dev.joe.superhero.data.remote.response

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import dev.joe.superhero.data.remote.model.Data

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
abstract class BaseResponseData<T>(@JsonProperty("data") var data: Data<T>? = null) :
    BaseResponse() {

    val hasData: Boolean
        @JsonIgnore get() = data != null && (data !is Collection<*> || !(data as Collection<*>).isEmpty())
}
