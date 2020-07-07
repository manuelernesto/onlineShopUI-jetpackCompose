package io.github.manuelernesto.onlineshopui_jetpackcompose

import androidx.compose.Composable
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.HorizontalScroller
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.VerticalScroller
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.Card
import androidx.ui.material.Surface
import androidx.ui.res.colorResource
import androidx.ui.res.imageResource
import androidx.ui.unit.dp
import androidx.ui.unit.sp

@Composable
fun Home() {
    Column {
        Text(text = "Women", modifier = Modifier.padding(bottom = 8.dp, start = 16.dp, end = 16.dp), color = colorResource(id = R.color.title_color), fontSize = 32.sp)
        TabMenu(listItem = menuTabItens)

        VerticalScroller {
            Row(modifier = Modifier.fillMaxSize().wrapContentWidth()) {
                ItemList(productsOne)
                ItemList(productsTwo)
            }
        }
    }
}

@Composable
fun TabMenu(listItem: List<String>) {
    HorizontalScroller(modifier = Modifier.padding(top = 8.dp, bottom = 16.dp, start = 16.dp, end = 16.dp)) {
        listItem.forEach {
            Text(text = it, fontSize = 18.sp)
            Spacer(modifier = Modifier.preferredWidth(24.dp))
        }
    }
}

@Composable
fun ItemList(listProduct: List<Product>) {
    Column {
        listProduct.forEach {
            Column(modifier = Modifier.padding(top = 8.dp, bottom = 8.dp, start = 16.dp, end = 16.dp)) {
                Card(modifier = Modifier.preferredHeight(187.dp).preferredWidth(163.dp).clip(shape = RoundedCornerShape(16.dp))) {
                    Surface(color = colorResource(id = it.bgColor)) {
                        val img = imageResource(id = it.img)
                        Image(asset = img)
                    }
                }
                Text(
                        text = it.title,
                        color = colorResource(id = R.color.text_light_color),
                        modifier = Modifier.padding(top = 8.dp)
                )
                Text(text = it.price,
                        color = colorResource(id = R.color.text_dark_color))
            }
        }

    }

}