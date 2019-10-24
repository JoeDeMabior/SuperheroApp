package dev.joe.superhero.data.remote.service

import dev.joe.superhero.data.remote.response.*
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EventService {

    @GET("events/{id}")
    fun getEventsById(@Path("id") id: Long): Single<EventResponse>

    @GET("events")
    fun getEvents(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<EventResponse>

    @GET("events/{id}/characters")
    fun getEventsCharacters(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CharacterResponse>

    @GET("events/{id}/comics")
    fun getEventsComics(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<ComicResponse>

    @GET("events/{id}/creators")
    fun getEventsCreators(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CreatorResponse>

    @GET("events/{id}/series")
    fun getEventsSeries(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<SeriesResponse>

    @GET("events/{id}/stories")
    fun getEventsStories(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<StoriesResponse>

}
