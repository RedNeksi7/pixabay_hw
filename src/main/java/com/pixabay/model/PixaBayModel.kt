package com.pixabay

data class PixaBayModel(
    var hits: ArrayList<ImageModel>
)

data class ImageModel(
    var ImageURL: String
)
