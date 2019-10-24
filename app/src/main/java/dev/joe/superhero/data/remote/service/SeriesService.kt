package dev.joe.superhero.data.remote.service

import dev.joe.superhero.data.remote.response.*
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SeriesService {

    @GET("series/{id}")
    fun getSeriesById(@Path("id") id: Long): Single<SeriesResponse>

    @GET("series")
    fun getSeries(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<SeriesResponse>

    @GET("series/{id}/characters")
    fun getSeriesCharacters(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CharacterResponse>

    @GET("series/{id}/comics")
    fun getSeriesComics(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<ComicResponse>

    @GET("series/{id}/creators")
    fun getSeriesCreators(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CreatorResponse>

    @GET("series/{id}/events")
    fun getSeriesEvents(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<EventResponse>

    @GET("series/{id}/stories")
    fun getSeriesStories(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<StoriesResponse>

}
