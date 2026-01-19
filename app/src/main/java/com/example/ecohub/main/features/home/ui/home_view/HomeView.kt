package com.example.ecohub.main.features.home.ui.home_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ecohub.core.ui.pager_router_screen.PagerRouterNavigator

@Composable
fun HomeView(
    layoutPadding: PaddingValues,
    pagerRouter: PagerRouterNavigator
) {
    val colors = MaterialTheme.colorScheme

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colors.background)
    ) {

    }
}
