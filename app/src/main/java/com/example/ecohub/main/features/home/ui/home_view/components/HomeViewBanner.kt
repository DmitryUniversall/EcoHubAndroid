package com.example.ecohub.main.features.home.ui.home_view.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.ecohub.R
import com.example.ecohub.main.common.ui.paddingHorizontalMD
import com.example.ecohub.main.common.ui.paddingLG
import com.example.ecohub.main.common.ui.paddingSM
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.text.TextDisplayMedium
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground

@Composable
fun HomeViewBanner(
    modifier: Modifier,
    bannerHeight: Int
) {
    val colors = MaterialTheme.colorScheme
    val gradients = Locals.gradients
    val shapes = Locals.shapes
    val spacing = Locals.spacing

    Box(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(bannerHeight.dp)
                .withShapedBackground(
                    brush = gradients.primaryLeft,
                    shape = shapes.roundedXL
                )
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .paddingLG(),
                horizontalArrangement = Arrangement.spacedBy(spacing.xs)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(0.6f),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    TextDisplayMedium(
                        text = stringResource(R.string.home_banner_text),
                        color = colors.onPrimary,
                        override = {
                            fontWeight = FontWeight.Bold
                        }
                    )

                    Box(
                        modifier = Modifier
                            .withShapedBackground(
                                color = colors.surface.copy(alpha = 0.2f),
                                shape = shapes.roundedPill
                            )
                            .border(
                                border = BorderStroke(2.dp, color = colors.surface),
                                shape = shapes.roundedPill
                            )
                            .paddingHorizontalMD()
                            .paddingSM(),
                        contentAlignment = Alignment.Center
                    ) {
                        TextBodyLarge(
                            text = stringResource(R.string.home_banner_button_text),
                            color = colors.surface,
                            override = {
                                fontWeight = FontWeight.SemiBold
                            }
                        )
                    }
                }
            }
        }

        Image(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .offset(y = (-20).dp)
                .height(220.dp)
                .aspectRatio(1f),
            painter = painterResource(R.drawable.img),
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
    }
}
