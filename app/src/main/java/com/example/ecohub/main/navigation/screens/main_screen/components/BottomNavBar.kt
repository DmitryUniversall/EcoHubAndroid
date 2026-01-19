package com.example.ecohub.main.navigation.screens.main_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.adamglin.PhosphorIcons
import com.adamglin.phosphoricons.Regular
import com.adamglin.phosphoricons.regular.Gear
import com.adamglin.phosphoricons.regular.Heart
import com.adamglin.phosphoricons.regular.House
import com.adamglin.phosphoricons.regular.Scroll
import com.adamglin.phosphoricons.regular.ShoppingCart
import com.example.ecohub.R
import com.example.ecohub.core.ui.pager_router_screen.PagerRouterNavigator
import com.example.ecohub.main.common.theme.Dimens
import com.example.ecohub.main.common.theme.Elevations
import com.example.ecohub.main.common.ui.TextOnSurface
import com.example.ecohub.main.common.ui.objectClickable
import com.example.ecohub.main.common.ui.paddingSm
import com.example.ecohub.main.common.ui.paddingXs
import com.example.ecohub.main.common.ui.roundedPill
import com.example.ecohub.main.navigation.screens.main_screen.MainScreenRoute

@Composable
private fun BottomNavItem(
    icon: ImageVector,
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val colors = MaterialTheme.colorScheme
    val rounded = MaterialTheme.shapes

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(Dimens.xs),
    ) {
        Box(
            modifier = Modifier
                .roundedPill()
                .objectClickable(onClick = onClick)
        ) {
            Box(
                modifier = Modifier
                    .background(
                        color = if (selected) colors.primary else Color.Transparent,
                        shape = rounded.extraLarge
                    )
                    .roundedPill()
                    .paddingXs()
            ) {
                Icon(
                    modifier = Modifier.size(Dimens.lg),
                    imageVector = icon,
                    contentDescription = null,
                    tint = if (selected) colors.onPrimary else colors.onSurface,
                )
            }
        }

        TextOnSurface(text = title)
    }
}

@Composable
fun BottomNavBar(
    pagerRouter: PagerRouterNavigator,
) {
    val colors = MaterialTheme.colorScheme
    val shapes = MaterialTheme.shapes

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens.md)
            .padding(bottom = Dimens.md)
            .systemBarsPadding(),
        color = colors.surface,
        shape = shapes.large,
        shadowElevation = Elevations.medium
    ) {
        Row(
            modifier = Modifier
                .paddingSm(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            BottomNavItem(
                icon = PhosphorIcons.Regular.House,
                title = stringResource(R.string.bottom_nav_home),
                selected = pagerRouter.currentRoute == MainScreenRoute.Home,
                onClick = {
                    pagerRouter.navigateTo(MainScreenRoute.Home)
                }
            )

            BottomNavItem(
                icon = PhosphorIcons.Regular.Heart,
                title = stringResource(R.string.bottom_nav_favorites),
                selected = pagerRouter.currentRoute == MainScreenRoute.Favorites,
                onClick = {
                    pagerRouter.navigateTo(MainScreenRoute.Favorites)
                }
            )

            BottomNavItem(
                icon = PhosphorIcons.Regular.ShoppingCart,
                title = stringResource(R.string.bottom_nav_cart),
                selected = pagerRouter.currentRoute == MainScreenRoute.Cart,
                onClick = {
                    pagerRouter.navigateTo(MainScreenRoute.Cart)
                }
            )

            BottomNavItem(
                icon = PhosphorIcons.Regular.Scroll,
                title = stringResource(R.string.bottom_nav_orders),
                selected = pagerRouter.currentRoute == MainScreenRoute.Orders,
                onClick = {
                    pagerRouter.navigateTo(MainScreenRoute.Orders)
                }
            )

            BottomNavItem(
                icon = PhosphorIcons.Regular.Gear,
                title = stringResource(R.string.bottom_nav_settings),
                selected = pagerRouter.currentRoute == MainScreenRoute.Settings,
                onClick = {
                    pagerRouter.navigateTo(MainScreenRoute.Settings)
                }
            )
        }
    }
}
