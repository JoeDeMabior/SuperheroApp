package dev.joe.superhero.data.remote.service

import dev.joe.superhero.data.remote.response.*
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface StoriesService {

    @GET("stories/{id}")
    fun getStoriesById(@Path("id") id: Long): Single<StoriesResponse>

    @GET("stories")
    fun getStories(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<StoriesResponse>

    @GET("stories/{id}/characters")
    fun getStoriesCharacters(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CharacterResponse>

    @GET("stories/{id}/comics")
    fun getStoriesComics(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<ComicResponse>

    @GET("stories/{id}/creators")
    fun getStoriesCreators(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CreatorResponse>

    @GET("stories/{id}/events")
    fun getStoriesEvents(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<EventResponse>

    @GET("stories/{id}/series")
    fun geStoriesSeries(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<SeriesResponse>

}
