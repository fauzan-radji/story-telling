package com.fauzan.storytelling.data.remote.response

import com.fauzan.storytelling.data.local.entity.StoryEntity
import com.fauzan.storytelling.data.model.StoryModel
import com.google.gson.annotations.SerializedName

data class Story(

	@field:SerializedName("photoUrl")
	val photoUrl: String,

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("lon")
	val lon: Double?,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("lat")
	val lat: Double?
) {
	fun toStoryModel(): StoryModel {
		return StoryModel(
			photoUrl = photoUrl,
			createdAt = createdAt,
			name = name,
			description = description,
			lon = lon,
			id = id,
			lat = lat
		)
	}

	fun toStoryEntity(): StoryEntity {
		return StoryEntity(
			id = id,
			name = name,
			photoUrl = photoUrl,
			description = description,
			createdAt = createdAt,
			lat = lat,
			lon = lon
		)
	}
}