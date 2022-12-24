package com.example.month4_lesson_1.ui.onBoard

data class BoardModel(
    var img: Int,
    var title: String,
    var description: String,
    var isLast: Boolean? = false
) : java.io.Serializable