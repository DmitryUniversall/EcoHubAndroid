package com.example.ecohub.main.features.home.ui.home_view.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.adamglin.PhosphorIcons
import com.adamglin.phosphoricons.Fill
import com.adamglin.phosphoricons.Regular
import com.adamglin.phosphoricons.fill.MapPin
import com.adamglin.phosphoricons.regular.ShoppingCart
import com.example.ecohub.R
import com.example.ecohub.core.ui.pager_router_screen.PagerRouterNavigator
import com.example.ecohub.main.common.ui.objectClickable
import com.example.ecohub.main.common.ui.paddingHorizontalScreen
import com.example.ecohub.main.common.ui.paddingSM
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.text.TextBodyMedium
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.theme.Locals.dimens
import com.example.ecohub.main.common.ui.withShapedBackground
import com.example.ecohub.main.navigation.screens.main_screen.MainScreenRoute

@Composable
fun HomeViewTopBar(
    pagerRouter: PagerRouterNavigator
) {
    val shapes = Locals.shapes
    val spacing = Locals.spacing
    val extraColors = Locals.extraColors
    val colors = MaterialTheme.colorScheme

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .paddingHorizontalScreen(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(spacing.xs)
        ) {
            TextBodyLarge(
                text = stringResource(R.string.delivery_address),
                override = {
                    fontWeight = FontWeight.SemiBold
                }
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(spacing.xxs)
            ) {
                Icon(
                    modifier = Modifier.size(dimens.md),
                    imageVector = PhosphorIcons.Fill.MapPin,
                    contentDescription = null,
                    tint = colors.primary
                )

                TextBodyMedium(
                    text = stringResource(R.string.delivery_address_template),
                    color = extraColors.muted,
                    override = {
                        fontWeight = FontWeight.SemiBold
                    }
                )
            }
        }

        Row(
            modifier = Modifier
                .withShapedBackground(
                    color = colors.onSurface,
                    shape = shapes.roundedPill
                )
                .paddingSM(),
            horizontalArrangement = Arrangement.spacedBy(spacing.xs),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .size(dimens.lg)
                    .objectClickable {
                        pagerRouter.navigateTo(MainScreenRoute.Cart)
                    },
                imageVector = PhosphorIcons.Regular.ShoppingCart,
                contentDescription = null,
                tint = colors.background
            )

            TextBodyLarge(
                text = "10",
                color = colors.surface,
                override = {
                    fontWeight = FontWeight.SemiBold
                }
            )
        }
    }
}