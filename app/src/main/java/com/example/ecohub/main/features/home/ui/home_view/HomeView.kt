package com.example.ecohub.main.features.home.ui.home_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecohub.core.ui.pager_router_screen.PagerRouterNavigator
import com.example.ecohub.main.common.ui.paddingHorizontalScreen
import com.example.ecohub.main.common.ui.paddingVerticalScreen
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
    val topBarHeight = 120

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = colors.surface)
            .verticalScroll(scrollState)
            .padding(
                top = layoutPadding.calculateTopPadding(),
                bottom = layoutPadding.calculateBottomPadding()
            )
    ) {
        Box(
            modifier = Modifier.paddingVerticalScreen()
        ) {
            Column {
                Box(
                    modifier = Modifier.height(topBarHeight.dp)
                ) {
                    HomeViewTopBar(pagerRouter = pagerRouter)
                }

                Box(
                    modifier = Modifier
                        .offset(y = (-spacing.xl.value + bannerHeight / 2).dp)
                        .withShapedBackground(
                            color = colors.background,
                            shape = shapes.roundedTopXL
                        )
                ) {
                    HomeViewContent()
                }
            }

            HomeViewBanner(
                bannerHeight = bannerHeight,
                modifier = Modifier
                    .offset(y = (topBarHeight - spacing.xl.value).dp)
                    .paddingHorizontalScreen()
            )
        }
    }
}
