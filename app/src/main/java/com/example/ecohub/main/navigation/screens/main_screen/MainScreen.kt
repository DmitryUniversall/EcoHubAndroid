package com.example.ecohub.main.navigation.screens.main_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.ecohub.core.ui.pager_router_screen.PagerRouterScreen
import com.example.ecohub.core.ui.pager_router_screen.rememberPagerRouterScreenState
import com.example.ecohub.main.features.cart.ui.cart_view.CartView
import com.example.ecohub.main.features.favorites.ui.favorites_view.FavoritesView
import com.example.ecohub.main.features.home.ui.home_view.HomeView
import com.example.ecohub.main.features.orders.ui.orders_view.OrdersView
import com.example.ecohub.main.features.settings.ui.settings_view.SettingsView
import com.example.ecohub.main.navigation.screens.main_screen.components.BottomNavBar

@Composable
fun MainScreen() {
    val router = rememberPagerRouterScreenState(
        MainScreenRoute.routes,
        startRoute = MainScreenRoute.Home
    )

    Scaffold(
        bottomBar = { BottomNavBar(pagerRouter = router) },
        containerColor = Color.Transparent
    ) { padding ->
        PagerRouterScreen(
            modifier = Modifier.fillMaxSize(),
            state = router
        ) {
            composable(MainScreenRoute.Home) { HomeView(layoutPadding = padding, pagerRouter = router) }
            composable(MainScreenRoute.Favorites) { FavoritesView(layoutPadding = padding) }
            composable(MainScreenRoute.Cart) { CartView(layoutPadding = padding) }
            composable(MainScreenRoute.Orders) { OrdersView(layoutPadding = padding) }
            composable(MainScreenRoute.Settings) { SettingsView(layoutPadding = padding) }
        }
    }
}
