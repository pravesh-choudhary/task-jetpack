package com.example.myapplication

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource

@Composable
fun BottomNavBar() {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Parivar,
        NavigationItem.Orders,
        NavigationItem.Customers,
        NavigationItem.Gullak
    )
    BottomNavigation(
        backgroundColor = Color.White,

        ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = colorResource(id = R.color.pink_primary),
                unselectedContentColor = colorResource(id = R.color.button_selected_bottom),
                alwaysShowLabel = true,
                selected = item.selected,
                onClick = {

                }
            )
        }
    }
}