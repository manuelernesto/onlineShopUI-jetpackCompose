package io.github.manuelernesto.onlineshopui_jetpackcompose

import androidx.annotation.DrawableRes

data class Product(
        val title: String,
        val price: String,
        @DrawableRes val bgColor: Int,
        @DrawableRes val img: Int
)

val productsOne = listOf(
        Product("Office Code", "\$234", R.color.office_code_color, R.drawable.office_code),
        Product("Hang Top", "\$234", R.color.hang_top_color, R.drawable.hang_top),
        Product("Hiclipart", "\$234", R.color.hiclipart_color, R.drawable.hiclipart)
)

val productsTwo = listOf(
        Product("Belt Bag", "\$234", R.color.belt_bag_color, R.drawable.belt_bag),
        Product("Old Fashion", "\$234", R.color.old_fashion_color, R.drawable.old_fashion),
        Product("Women Bag", "\$234", R.color.women_bag_color, R.drawable.women_bag)
)
val menuTabItens = listOf("Hand bag", "Jewellery", "Footwear", "Dresses")