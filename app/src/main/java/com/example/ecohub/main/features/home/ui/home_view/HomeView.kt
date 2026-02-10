package com.example.ecohub.main.features.home.ui.home_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecohub.core.ui.pager_router_screen.PagerRouterNavigator
import com.example.ecohub.main.common.ui.paddingScreen
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground
import com.example.ecohub.main.features.home.ui.home_view.components.HomeViewBanner
import com.example.ecohub.main.features.home.ui.home_view.components.HomeViewTopBar
import com.example.ecohub.main.features.home.ui.home_view.components.content.HomeViewContent


@Composable
fun HomeView(
    layoutPadding: PaddingValues,
    pagerRouter: PagerRouterNavigator
) {
    val colors = MaterialTheme.colorScheme
    val shapes = Locals.shapes
    val spacing = Locals.spacing

    val bannerHeight = 200
    val topBarHeight = 300

    Box(
        modifier = Modifier
            .fillMaxSize()
            .paddingScreen()
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(topBarHeight.dp)
                        .background(color = colors.surface)
                        .padding(top = layoutPadding.calculateTopPadding())
                ) {
                    HomeViewTopBar(pagerRouter = pagerRouter)
                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .offset(y = -spacing.xl)
                        .withShapedBackground(
                            color = colors.background,
                            shape = shapes.roundedTopXL
                        )
                        .padding(top = (bannerHeight / 2).dp)
                ) {
                    HomeViewContent()
                }
            }

            HomeViewBanner(
                bannerHeight = bannerHeight,
                modifier = Modifier
                    .offset(y = (300 - (bannerHeight / 2) - spacing.xl.value).dp)
            )
        }
    }
}
