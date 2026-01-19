package com.example.ecohub.main.navigation

sealed class AppRoute(val routeName: String) {
    object Main : AppRoute("main")
}
