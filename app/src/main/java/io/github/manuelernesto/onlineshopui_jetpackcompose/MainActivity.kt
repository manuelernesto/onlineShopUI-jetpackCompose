package io.github.manuelernesto.onlineshopui_jetpackcompose

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.setContent
import androidx.ui.foundation.Icon
import androidx.ui.foundation.Text
import androidx.ui.material.IconButton
import androidx.ui.material.Scaffold
import androidx.ui.material.TopAppBar
import androidx.ui.res.colorResource
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import io.github.manuelernesto.onlineshopui_jetpackcompose.ui.OnlineShopUIJetPackComposeTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OnlineShopUIJetPackComposeTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Scaffold(
            topAppBar = {
                TopAppBar(
                        elevation = 0.dp,
                        title = { Text(text = "") },
                        navigationIcon = {
                            IconButton(onClick = { }) {
                                Icon(
                                        imageResource(R.drawable.back_black),
                                        tint = colorResource(id = R.color.text_dark_color)
                                )
                            }
                        },
                        actions = {
                            IconButton(onClick = { }) {
                                Icon(
                                        imageResource(R.drawable.search_black),
                                        tint = colorResource(id = R.color.text_dark_color)
                                )
                            }
                            IconButton(onClick = { }) {
                                Icon(
                                        imageResource(R.drawable.cart_black),
                                        tint = colorResource(id = R.color.text_dark_color)
                                )
                            }

                        }
                )
            },
            bodyContent = { Home() }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OnlineShopUIJetPackComposeTheme {
        App()
    }
}

