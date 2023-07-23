package com.pixabay

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PixaBayApi {

    @GET("api/")
    fun getPictures(
        @Query("key") key: String = "38383918-cfc0a89d42e1d2970467a5502",
        @Query("q") keyWord: String,
        @Query("per_page") pearPage: Int = 3,
        @Query("page") page: Int
    )  : Call<PixaBayModel>
}