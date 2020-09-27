package com.aung.coderswag.service

import com.aung.coderswag.model.Category
import com.aung.coderswag.model.Product

object DataService {
    val categories = listOf(
        Category("Shirts", "shirtimage"),
        Category("Hat", "hatimage"),
        Category("Hoodie", "hoodieimage"),
        Category("Digital", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Hat1", "$0.1", "hat1"),
        Product("Hat2", "$0.2", "hat2"),
        Product("Hat3", "$0.3", "hat3"),
        Product("Hat4", "$0.4", "hat4")
    )

    val shirts = listOf(
        Product("Shirt1", "$0.1", "shirt1"),
        Product("Shirt2", "$0.2", "shirt2"),
        Product("Shirt3", "$0.3", "shirt3"),
        Product("Shirt4", "$0.4", "shirt4")
    )

    val hoodies = listOf(
        Product("Hoodie1", "$0.1", "hoodie1"),
        Product("Hoodie2", "$0.2", "hoodie2"),
        Product("Hoodie3", "$0.3", "hoodie3"),
        Product("Hoodie4", "$0.4", "hoodie4")
    )
}