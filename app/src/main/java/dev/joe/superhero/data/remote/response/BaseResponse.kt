package dev.joe.superhero.data.remote.response

import android.text.TextUtils
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import dev.joe.superhero.data.remote.status.Status

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
abstract class BaseResponse(
    @JsonProperty("code") var code: Int = 0,
    @JsonProperty("status") var status: String? = null,
    @JsonProperty("message") var message: String? = null
) {
    @get:JsonIgnore
    val hasStatus: Boolean
        get() = !TextUtils.isEmpty(status)

    @get:JsonIgnore
    val hasError: Boolean
        get() = !Status.OK.equals(status, ignoreCase = true)
}
