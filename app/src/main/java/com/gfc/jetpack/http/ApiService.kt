package com.gfc.jetpack.http

import com.gfc.jetpack.bean.ArticleBean
import com.gfc.jetpack.bean.BannerBean
import com.zs.wanandroid.entity.UserBean
import retrofit2.http.*

/**
 * @date 2020/5/9
 * @author zs
 */
interface ApiService {
    /**
     * 获取首页文章数据
     */
    @GET("/article/list/{page}/json")
    suspend fun getHomeList(@Path("page") pageNo: Int): ApiResponse<ArticleBean>

    /**
     * 登录
     */
    @FormUrlEncoded
    @POST("/user/login")
    suspend fun login(@Field("username") username: String,
                      @Field("password") password: String): ApiResponse<UserBean>
    /**
     * banner
     */
    @GET("/banner/json")
    suspend fun getBanner(): ApiResponse<MutableList<BannerBean>>

}