package com.example.ecohub.main.features.home.ui.home_view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.ecohub.R
import com.example.ecohub.core.ui.pager_router_screen.PagerRouterNavigator
import com.example.ecohub.main.common.theme.Dimens
import com.example.ecohub.main.common.ui.TextB1
import com.example.ecohub.main.common.ui.TextB2
import com.example.ecohub.main.common.ui.TextH2
import com.example.ecohub.main.common.ui.paddingLG
import com.example.ecohub.main.common.ui.paddingSM
import com.example.ecohub.main.common.ui.paddingScreenHorizontal
import com.example.ecohub.main.common.ui.roundedPillShape
import com.example.ecohub.main.common.ui.roundedTopXLShape
import com.example.ecohub.main.common.ui.roundedXLShape
import com.example.ecohub.main.common.ui.withShapedBackground

@Composable
fun HomeViewBanner(
    modifier: Modifier = Modifier
) {
    val colors = MaterialTheme.colorScheme

    val bannerBackgroundGradient = Brush.linearGradient(
        colors = listOf(
            Color(0xFFFFA400),
            Color(0xFFFFAB07),
            Color(0xFFFFAB07)
        ),
        start = androidx.compose.ui.geometry.Offset.Zero,
        end = androidx.compose.ui.geometry.Offset.Infinite
    )

    Box(
        modifier = modifier
            .fillMaxSize()
            .withShapedBackground(
                brush = bannerBackgroundGradient,
                shape = roundedXLShape()
            )
            .paddingLG()
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(Dimens.xs)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                TextH2(
                    text = stringResource(R.string.home_banner_text),
                    color = colors.onPrimary
                )

                Box(
                    modifier = Modifier
                        .withShapedBackground(
                            color = colors.surface.copy(alpha = 0.3f),
                            shape = roundedPillShape()
                        )
                        .border(
                            border = BorderStroke(2.dp, color = colors.onPrimary),
                            shape = roundedPillShape()
                        )
                        .paddingSM(),
                    contentAlignment = Alignment.Center
                ) {
                    TextB1(
                        text = stringResource(R.string.home_banner_button_text),
                        color = colors.onPrimary
                    )
                }
            }
        }
    }
}

@Composable
fun HomeView(
    layoutPadding: PaddingValues,
    pagerRouter: PagerRouterNavigator
) {
    val colors = MaterialTheme.colorScheme

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .background(color = colors.surface)
                ) {

                }

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                        .offset(y = -Dimens.xl)
                        .withShapedBackground(
                            color = colors.background,
                            shape = roundedTopXLShape()
                        )
                ) {

                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(148.dp)
                    .offset(y = (300 - 74).dp)
                    .paddingScreenHorizontal()
            ) {
                HomeViewBanner(
                    modifier = Modifier
                        .zIndex(1f)
                )
            }
        }
    }
}
