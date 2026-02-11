package com.example.ecohub.main.features.cart.ui.cart_view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import coil.compose.SubcomposeAsyncImage
import com.adamglin.PhosphorIcons
import com.adamglin.phosphoricons.Regular
import com.adamglin.phosphoricons.regular.Minus
import com.adamglin.phosphoricons.regular.Plus
import com.adamglin.phosphoricons.regular.Trash
import com.example.ecohub.R
import com.example.ecohub.main.common.ui.paddingHorizontalScreen
import com.example.ecohub.main.common.ui.paddingMD
import com.example.ecohub.main.common.ui.paddingSM
import com.example.ecohub.main.common.ui.paddingXS
import com.example.ecohub.main.common.ui.paddingXXS
import com.example.ecohub.main.common.ui.paddingXXXS
import com.example.ecohub.main.common.ui.shimmer
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.text.TextBodyMedium
import com.example.ecohub.main.common.ui.text.TextHeadlineLarge
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground

@Composable
fun CartView(
    layoutPadding: PaddingValues
) {
    val spacing = Locals.spacing

    Column(
        modifier = Modifier
            .paddingHorizontalScreen(),
        verticalArrangement = Arrangement.spacedBy(spacing.screenPadding)
    ) {
        CartItemCard(title = "Red Apple", count = 1)
        CartItemCard(title = "Red Apple", count = 1)
        CartItemCard(title = "Red Apple", count = 1)
    }
}

@Composable
fun CartItemCard(
    title: String,
    count: Int
) {
    val spacing = Locals.spacing
    val shapes = Locals.shapes
    val dimens = Locals.dimens
    val extraColors = Locals.extraColors
    val gradients = Locals.gradients
    val colors = MaterialTheme.colorScheme

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .withShapedBackground(
                color = colors.surface,
                shape = shapes.roundedMD
            )
            .paddingMD()
            .wrapContentSize()
    ) {
        SubcomposeAsyncImage(
            modifier = Modifier
                .weight(0.4f)
                .aspectRatio(1f)
                .paddingXXS(),
            contentScale = ContentScale.Fit,
            model = "https://cdn-icons-png.flaticon.com/128/14779/14779021.png",
            contentDescription = null,
            loading = {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
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

        Box(
            modifier = Modifier
                .weight(0.6f)
        ) {
            Box(
                modifier = Modifier
                    .withShapedBackground(
                        color = extraColors.delete.copy(alpha = 0.1f),
                        shape = shapes.roundedPill
                    )
                    .align(Alignment.TopEnd)
                    .paddingXS()
            ) {
                Icon(
                    modifier = Modifier.size(dimens.md),
                    imageVector = PhosphorIcons.Regular.Trash,
                    contentDescription = null,
                    tint = extraColors.delete
                )
            }

            Column(
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    TextHeadlineLarge(
                        text = title,
                        override = {
                            fontWeight = FontWeight.Bold
                        }
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    TextBodyLarge(
                        text = "${stringResource(R.string.test_product_currency)}${stringResource(R.string.test_product_price)}/${stringResource(R.string.test_product_weight_unit)}",
                        color = colors.onSurface,
                        override = {
                            fontWeight = FontWeight.SemiBold
                        }
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(spacing.md),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .withShapedBackground(
                                brush = gradients.primaryLeft,
                                shape = shapes.roundedMD
                            )
                            .paddingSM()
                    ) {
                        TextBodyLarge(
                            text = stringResource(R.string.buy_now),
                            color = colors.onPrimary,
                            override = {
                                fontWeight = FontWeight.Bold
                            }
                        )
                    }

                    Row(
                        modifier = Modifier
                            .withShapedBackground(
                                color = colors.background,
                                shape = shapes.roundedPill
                            )
                            .paddingXXXS(),
                        horizontalArrangement = Arrangement.spacedBy(spacing.xs)
                    ) {
                        Box(
                            modifier = Modifier
                                .withShapedBackground(
                                    color = colors.surface,
                                    shape = shapes.roundedPill
                                )
                                .paddingXXXS()
                        ) {
                            Icon(
                                modifier = Modifier.size(dimens.md),
                                imageVector = PhosphorIcons.Regular.Minus,
                                contentDescription = null,
                                tint = colors.onSurface,
                            )
                        }

                        TextBodyMedium(
                            text = count.toString(),
                            color = colors.onSurface,
                            override = {
                                fontWeight = FontWeight.SemiBold
                            }
                        )

                        Box(
                            modifier = Modifier
                                .withShapedBackground(
                                    color = colors.surface,
                                    shape = shapes.roundedPill
                                )
                                .paddingXXXS()
                        ) {
                            Icon(
                                modifier = Modifier.size(dimens.md),
                                imageVector = PhosphorIcons.Regular.Plus,
                                contentDescription = null,
                                tint = colors.onSurface,
                            )
                        }
                    }
                }
            }
        }
    }
}