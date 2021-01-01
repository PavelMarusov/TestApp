package com.example.testapp.ui.model

data class PostModel(
    var title: String? = null,
    var priceSize: Int? = null,
    var currency: String? = null,
    var location: String? = null,
    var description: String? = null,
    var url: String? = null
) {
}