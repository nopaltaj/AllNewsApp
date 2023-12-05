package com.idn.news.app.data.network


import com.idn.news.app.data.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("/v2/everything")
    fun getCommonNews(
        @Query("q") q:String = "islam",
        @Query("languange") languange:String = "en",
        @Query("pageSize") pageSize:Int = 50,
        @Query("sortBy") sortBy:String = "popularity",
    ):Call<NewsResponse>

    @GET("/v2/everything")
    fun getAlQuranNews(
        @Query("q")q : String = "Al-quran",
        @Query("languange")languange : String = "en",
    ): Call<NewsResponse>

    @GET("/v2/top-headlines")
    fun getAlJazeeraNews(
        @Query("sources") sources:String = "al-jazeera-english",
    ):Call<NewsResponse>

    @GET("/v2/everything")
    fun getWarningforMuslimNews(
        @Query("q") q:String = "anti islam",
        @Query("languange") languange:String = "en",
    ):Call<NewsResponse>

    @GET("/v2/everything")
    fun getSearchNews(
        @Query("q") q:String,
        @Query("pageSize") pageSize:Int = 19,
    ):Call<NewsResponse>


}