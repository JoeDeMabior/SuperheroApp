package dev.joe.superhero.data.remote.service

import dev.joe.superhero.data.remote.response.*
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CreatorService {

    @GET("creators/{id}")
    fun getCreatorsById(@Path("id") id: Long): Single<CreatorResponse>

    @GET("creators")
    fun getCreators(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CreatorResponse>

    @GET("creators/{id}/comics")
    fun getCreatorsComics(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<ComicResponse>

    @GET("creators/{id}/events")
    fun getCreatorsEvents(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<EventResponse>

    @GET("creators/{id}/series")
    fun getCreatorsSeries(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<SeriesResponse>

    @GET("creators/{id}/stories")
    fun getCreatorsStories(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<StoriesResponse>

}
