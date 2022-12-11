package uz.isystem.lesson26.core.models

class MealData(
    val image: String,
    val title: String,
    val shortDescription: String,
    val fullDescription: String,
    var isFavorite: Boolean = false,
    val rating: Float
)