package com.example.ecohub.main.navigation.screens.main_screen

import com.example.ecohub.core.ui.pager_router_screen.PagerRoute


sealed class MainScreenRoute(override val key: String) : PagerRoute {
    object Home : MainScreenRoute("home")
    object Favorites : MainScreenRoute("favorites")
    object Cart : MainScreenRoute("cart")
    object Orders : MainScreenRoute("orders")
    object Settings : MainScreenRoute("settings")

    companion object {
        val routes: List<MainScreenRoute> = listOf(Home, Favorites, Cart, Orders, Settings)
    }
}
