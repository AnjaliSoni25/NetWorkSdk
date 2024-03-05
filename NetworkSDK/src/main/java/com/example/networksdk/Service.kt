package com.example.networksdk

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface Service {
    val header: String
        get() = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjYzIyZDM1YTIzMGYyOTJlYjI2YzE1MjBhMWY4ODI5ZSIsInN1YiI6IjY1Y2EzNDAwY2U2YzRjMDE3Y2JjMGM3ZiIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.VivTsb-qkIq2csqoCEeEDmjQIpDHlO1nVvXa_VSgxkA"

    @GET("movie/popular")
    @Headers("accept: application/json")
    suspend fun getPopularMovies(
        @Query("language") language: String,
        @Query("page") page: Int
    ): MovieResponse


    @GET("movie/top_rated")
    @Headers("accept: application/json")
    fun getTopRatedMovies(
      //  @Header("Authorization") apiKey: String=header,
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1
    ): MovieResponse
}