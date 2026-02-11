package com.example.ecohub.main.common.ui.shared

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
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
import com.adamglin.phosphoricons.Fill
import com.adamglin.phosphoricons.Regular
import com.adamglin.phosphoricons.fill.Heart
import com.adamglin.phosphoricons.regular.Heart
import com.adamglin.phosphoricons.regular.ShoppingCart
import com.example.ecohub.R
import com.example.ecohub.main.common.ui.paddingHorizontalSM
import com.example.ecohub.main.common.ui.paddingMD
import com.example.ecohub.main.common.ui.paddingVerticalXXS
import com.example.ecohub.main.common.ui.paddingXXS
import com.example.ecohub.main.common.ui.shimmer
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.text.TextBodyMedium
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground

@Composable
fun ProductCard(
    modifier: Modifier = Modifier,
    liked: Boolean = false,
    sale: String? = null
) {
    val shapes = Locals.shapes
    val spacing = Locals.spacing
    val dimens = Locals.dimens
    val extraColors = Locals.extraColors
    val colors = MaterialTheme.colorScheme

    Box(
        modifier = modifier
            .withShapedBackground(
                color = colors.surface,
                shape = shapes.roundedMD
            )
            .wrapContentHeight()
            .paddingMD()
    ) {
        Box {
            Column(
                verticalArrangement = Arrangement.spacedBy(spacing.md)
            ) {
                SubcomposeAsyncImage(
                    modifier = Modifier
                        .aspectRatio(1f)
                        .fillMaxWidth()
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

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(spacing.xs)
                    ) {
                        TextBodyLarge(
                            text = stringResource(R.string.test_product_title),
                            color = extraColors.muted
                        )

                        TextBodyLarge(
                            text = "${stringResource(R.string.test_product_currency)}${
                                stringResource(
                                    R.string.test_product_price
                                )
                            }/${stringResource(R.string.test_product_weight_unit)}",
                            color = colors.onSurface,
                            override = {
                                fontWeight = FontWeight.SemiBold
                            }
                        )
                    }
                    Box(
                        modifier = Modifier
                            .withShapedBackground(
                                color = colors.primary,
                                shape = shapes.roundedPill
                            )
                            .paddingMD()
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(dimens.md),
                            imageVector = PhosphorIcons.Regular.ShoppingCart,
                            contentDescription = null,
                            tint = colors.onPrimary
                        )
                    }
                }
            }
        }

        Icon(
            modifier = Modifier
                .size(dimens.lg)
                .align(Alignment.TopEnd),
            imageVector = if (liked) PhosphorIcons.Fill.Heart else PhosphorIcons.Regular.Heart,
            contentDescription = null,
            tint = if (liked) extraColors.heart else extraColors.muted
        )

        if (sale != null) {
            Box(
                modifier = Modifier
                    .withShapedBackground(
                        color = extraColors.sale,
                        shape = shapes.roundedPill
                    )
                    .paddingHorizontalSM()
                    .paddingVerticalXXS()
            ) {
                TextBodyMedium(
                    text = sale,
                    color = colors.onPrimary
                )
            }
        }
    }
}
