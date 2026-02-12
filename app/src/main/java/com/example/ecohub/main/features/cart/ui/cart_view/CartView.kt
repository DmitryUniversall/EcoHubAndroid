package com.example.ecohub.main.features.cart.ui.cart_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.adamglin.PhosphorIcons
import com.adamglin.phosphoricons.Regular
import com.adamglin.phosphoricons.regular.Minus
import com.adamglin.phosphoricons.regular.Plus
import com.example.ecohub.main.common.ui.objectClickable
import com.example.ecohub.main.common.ui.paddingHorizontalScreen
import com.example.ecohub.main.common.ui.paddingMD
import com.example.ecohub.main.common.ui.paddingScreen
import com.example.ecohub.main.common.ui.paddingXXS
import com.example.ecohub.main.common.ui.shimmer
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.text.TextBodyMedium
import com.example.ecohub.main.common.ui.text.TextBodySmall
import com.example.ecohub.main.common.ui.text.TextHeadlineLarge
import com.example.ecohub.main.common.ui.text.TextHeadlineMedium
import com.example.ecohub.main.common.ui.text.TextHeadlineSmall
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground

@Composable
fun CartView(
    layoutPadding: PaddingValues
) {
    val spacing = Locals.spacing

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(scrollState),
    ) {
        Column(
            modifier = Modifier
                .padding(
                    top = layoutPadding.calculateTopPadding() + spacing.screenPadding,
                    bottom = layoutPadding.calculateBottomPadding() + spacing.screenPadding,
                    start = spacing.screenPadding,
                    end = spacing.screenPadding
                ),
            verticalArrangement = Arrangement.spacedBy(spacing.screenPadding)
        ) {
            CartItemCard(title = "Red Apple", price = 10, currency = "$", unit = "kg")
            CartItemCard(title = "Red Apple", price = 10, currency = "$", unit = "kg")
            CartItemCard(title = "Red Apple", price = 10, currency = "$", unit = "kg")
            CartItemCard(title = "Red Apple", price = 10, currency = "$", unit = "kg")
            CartItemCard(title = "Red Apple", price = 10, currency = "$", unit = "kg")
            CartItemCard(title = "Red Apple", price = 10, currency = "$", unit = "kg")
            CartItemCard(title = "Red Apple", price = 10, currency = "$", unit = "kg")
        }
    }
}

@Composable
fun CartItemCard(
    title: String,
    price: Int,
    currency: String,
    unit: String
) {
    val spacing = Locals.spacing
    val shapes = Locals.shapes
    val extraColors = Locals.extraColors
    val colors = MaterialTheme.colorScheme

    var tempItemQuantity by remember { mutableIntStateOf(1) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .withShapedBackground(
                color = colors.surface,
                shape = shapes.roundedMD
            ),
    ) {
        Column(
            modifier = Modifier
                .paddingMD(),
            verticalArrangement = Arrangement.spacedBy(spacing.md)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(spacing.md)
            ) {
                Column(
                    modifier = Modifier
                        .weight(0.7f),
                    verticalArrangement = Arrangement.spacedBy(spacing.sm)
                ) {
                    TextHeadlineLarge(
                        text = title,
                        styleOverride = {
                            fontWeight = FontWeight.Bold
                        }
                    )

                    TextBodyMedium(
                        text = "Fresh red apples",
                        color = extraColors.muted,
                        layoutOverride = {
                            overflow = TextOverflow.Ellipsis
                        }
                    )

                    Row(
                        verticalAlignment = Alignment.Bottom
                    ) {
                        TextBodyMedium(
                            text = "$currency$price",
                            color = colors.onSurface,
                            styleOverride = {
                                fontWeight = FontWeight.SemiBold
                            }
                        )

                        TextBodySmall(
                            text = "/$unit",
                            color = extraColors.muted,
                            styleOverride = {
                                fontWeight = FontWeight.SemiBold
                            }
                        )
                    }

                    HorizontalDivider(
                        thickness = 1.dp,
                        color = extraColors.muted.copy(alpha = 0.2f)
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextHeadlineMedium(
                            modifier = Modifier
                                .weight(0.5f),
                            text = "$currency${price * tempItemQuantity}",
                            color = colors.onSurface,
                            styleOverride = {
                                fontWeight = FontWeight.SemiBold
                            }
                        )

                        ProductCountSelect(
                            modifier = Modifier
                                .weight(0.5f),
                            value = tempItemQuantity,
                            onValueChange = { if (it in 1..<100) tempItemQuantity = it }
                        )
                    }
                }

                SubcomposeAsyncImage(
                    modifier = Modifier
                        .weight(0.3f)
                        .aspectRatio(1f)
                        .paddingXXS(),
                    contentScale = ContentScale.Fit,
                    model = "https://cdn-icons-png.flaticon.com/128/14779/14779021.png",
                    contentDescription = null,
                    loading = {
                        Box(
                            modifier = Modifier
                                .clip(shapes.roundedPill)
                                .shimmer(
                                    shape = shapes.roundedPill,
                                    baseColor = colors.background.copy(alpha = 0.08f),
                                    highlightColor = colors.background.copy(alpha = 0.20f)
                                )
                        )
                    },
                    error = {
                        TextBodyLarge("?")
                    }
                )
            }
        }
    }
}

@Composable
private fun ProductCountSelect(
    modifier: Modifier = Modifier,
    onValueChange: (Int) -> Unit,
    value: Int
) {
    val shapes = Locals.shapes
    val extraColors = Locals.extraColors
    val colors = MaterialTheme.colorScheme

    Row(
        modifier = modifier
            .height(IntrinsicSize.Min)
            .withShapedBackground(
                color = colors.primary,
                shape = shapes.roundedPill
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .paddingXXS()
                .clip(shape = shapes.roundedPill)
                .objectClickable {
                    onValueChange(value - 1)
                },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = PhosphorIcons.Regular.Minus,
                contentDescription = null,
                tint = colors.onPrimary,
            )
        }

        Box(
            modifier = Modifier
                .background(color = colors.surface)
                .fillMaxHeight()
                .weight(1f)
                .drawBehind {
                    val strokeWidth = 2.dp.toPx()

                    // Top border
                    drawLine(
                        color = extraColors.muted.copy(alpha = 0.2f),
                        start = Offset(0f, 0f),
                        end = Offset(size.width, 0f),
                        strokeWidth = strokeWidth
                    )

                    // Bottom border
                    drawLine(
                        color = extraColors.muted.copy(alpha = 0.2f),
                        start = Offset(0f, size.height),
                        end = Offset(size.width, size.height),
                        strokeWidth = strokeWidth
                    )
                },
            contentAlignment = Alignment.Center
        ) {
            TextHeadlineSmall(
                text = value.toString(),
                color = colors.onSurface,
                styleOverride = {
                    fontWeight = FontWeight.SemiBold
                }
            )
        }


        Box(
            modifier = Modifier
                .paddingXXS()
                .clip(shape = shapes.roundedPill)
                .objectClickable {
                    onValueChange(value + 1)
                },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = PhosphorIcons.Regular.Plus,
                contentDescription = null,
                tint = colors.onPrimary,
            )
        }
    }
}