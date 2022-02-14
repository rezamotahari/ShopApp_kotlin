package com.example.novinshop_project.data

import com.google.gson.annotations.SerializedName

data class ResponseBannersType(

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("link")
	val link: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("type")
	val type: String
)
