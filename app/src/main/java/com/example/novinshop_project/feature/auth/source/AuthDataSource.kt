package com.example.novinshop_project.feature.auth.source

import com.example.novinshop_project.data.*
import io.reactivex.Single

interface AuthDataSource {

    fun checkUser(phone:String):Single<ResponseCheckUser>
    fun registerUser(phone:String, name:String):Single<ResponseRegister>
    fun login(phone:String):Single<ResponseLogin>

    //
    fun saveToken(token:String)
    fun loadToken()
    fun checkLogin():Boolean
    fun addToBookmark(productId_:Int):Single<ResponseAddBookmark>
    fun addToCart(productId: Int,colorid:Int,sizeId:Int):Single<ResponseInsertCommnet>


}