package dev.joe.superhero.data.remote.service

import dev.joe.superhero.data.remote.response.*
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ComicSrvice {

    @GET("comics/{id}")
    fun getComicsById(@Path("id") id: Long): Single<ComicResponse>

    @GET("comics")
    fun getComics(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<ComicResponse>

    @GET("comics/{id}/characters")
    fun getComicsCharacters(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CharacterResponse>

    @GET("comics/{id}/creators")
    fun getComicsCreators(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<CreatorResponse>

    @GET("comics/{id}/events")
    fun getComicsEvents(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<EventResponse>

    @GET("comics/{id}/stories")
    fun getComicsStories(
        @Path("id") id: Long,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): Single<StoriesResponse>

}
