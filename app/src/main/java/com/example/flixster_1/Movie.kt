package com.example.flixster_1

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class Movie {

    @JvmField
    @SerializedName("title")
    var title: String? = null

    //TODO bookImageUrl
    @SerializedName("movie_image")
    var movieImageUrl: String? = null


    //TODO description
    @SerializedName("overview")
    var overview: String? = null

    @SerializedName("poster_path")
    var poster_path: String? = null


    //TODO-STRETCH-GOALS amazonUrl
}