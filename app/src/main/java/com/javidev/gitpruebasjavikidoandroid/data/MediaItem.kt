package com.javidev.gitpruebasjavikidoandroid.data

data class MediaItem(
    val id: Int,
    val title: String,
    val thumb: String,
    val tipo: Type
){
    enum class Type{PHOTO,VIDEO}
}


fun getMediaItem() = (1..10).map {
    MediaItem(
            id = it,
            title = "Title $it",
            thumb = "https://loremflickr.com/400/400/cat?lock=$it",
            tipo = if (it % 3 == 0) MediaItem.Type.PHOTO else MediaItem.Type.VIDEO
    )
}