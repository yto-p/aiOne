package com.mtuci.aiOne.main

import android.annotation.SuppressLint
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Create
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: String
)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainContent(controller: NavController) {
    val items = listOf(
        BottomNavigationItem(
            title = "Search",
            selectedIcon = Icons.Filled.Search,
            unselectedIcon = Icons.Outlined.Search,
            route = "search"
        ),
        BottomNavigationItem(
            title = "My ads",
            selectedIcon = Icons.Filled.Create,
            unselectedIcon = Icons.Outlined.Create,
            route = "ads"
        ),
        BottomNavigationItem(
            title = "Profile",
            selectedIcon = Icons.Filled.Person,
            unselectedIcon = Icons.Outlined.Person,
            route = "profile"
        )
    )

    Scaffold(
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by controller.currentBackStackEntryAsState()
                var currentRoute = navBackStackEntry?.destination?.route
                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentRoute == item.route,
                        onClick = {
                                  currentRoute = item.route
                                  controller.navigate(item.route)
                                  },
                        icon = {
                            Icon(
                                imageVector = if(currentRoute == item.route) {
                                    item.selectedIcon
                                } else item.unselectedIcon,
                                contentDescription = ""
                            )
                        },
                        label = {
                            Text(text = item.title)
                        }
                    )
                }
            }
        }
    ) { }
}