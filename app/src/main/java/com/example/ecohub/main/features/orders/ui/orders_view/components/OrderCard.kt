package com.example.ecohub.main.features.orders.ui.orders_view.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.ecohub.R
import com.example.ecohub.main.common.ui.paddingMD
import com.example.ecohub.main.common.ui.paddingTopXS
import com.example.ecohub.main.common.ui.paddingTopXXS
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.text.TextBodyMedium
import com.example.ecohub.main.common.ui.text.TextBodySmall
import com.example.ecohub.main.common.ui.text.TextHeadlineLarge
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground
import com.example.ecohub.main.features.orders.domain.entities.OrderItem
import com.example.ecohub.main.features.orders.domain.entities.OrderStatus
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun OrderCard(
    orderId: String,
    status: OrderStatus,
    createdAt: LocalDateTime,
    deliveryAddress: String,
    orderItems: List<OrderItem>,
    priceUnit: String
) {
    val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm")
    val shapes = Locals.shapes
    val spacing = Locals.spacing
    val extraColors = Locals.extraColors
    val colors = MaterialTheme.colorScheme

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .withShapedBackground(
                color = colors.surface,
                shape = shapes.roundedMD
            )
            .paddingMD(),
        verticalArrangement = Arrangement.spacedBy(spacing.md)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .weight(0.75f),
                verticalArrangement = Arrangement.spacedBy(spacing.md)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(spacing.xxs)
                ) {
                    TextHeadlineLarge(
                        text = when (status) {
                            OrderStatus.PENDING -> stringResource(R.string.order_pending)
                            OrderStatus.DELIVERED -> stringResource(R.string.order_delivered)
                            OrderStatus.CANCELLED -> stringResource(R.string.order_cancelled)
                        },
                        styleOverride = {
                            fontWeight = FontWeight.Bold
                        },
                        color = colors.primary
                    )

                    TextBodySmall(
                        text = orderId,
                        color = extraColors.muted,
                        styleOverride = {
                            fontWeight = FontWeight.Normal
                        }
                    )
                }

                Column (
                    verticalArrangement = Arrangement.spacedBy(spacing.xs)
                ){
                    TextBodyLarge(
                        text = formatter.format(createdAt),
                        color = colors.onSurface
                    )

                    TextBodyLarge(
                        text = deliveryAddress,
                        color = colors.onSurface
                    )
                }
            }

            Column(
                modifier = Modifier
                    .weight(0.25f),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.End
            ) {
                Image(
                    modifier = Modifier
                        .height(100.dp)
                        .aspectRatio(1f),
                    painter = painterResource(R.drawable.delivery_man_abstract),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    colorFilter = ColorFilter.tint(color = colors.onSurface)
                )
            }
        }

        HorizontalDivider(
            thickness = 1.dp,
            color = extraColors.muted.copy(alpha = 0.2f)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(spacing.xs)
        ) {
            orderItems.forEach { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TextBodyMedium(
                        text = item.title,
                        color = extraColors.muted
                    )

                    TextBodyMedium(
                        text = "${item.quantity} x ${item.price}${priceUnit}",
                        color = extraColors.muted,
                        layoutOverride = {
                            textAlign = TextAlign.End
                        }
                    )
                }
            }

            Row(
                modifier = Modifier
                    .paddingTopXS()
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextBodyMedium(
                    text = stringResource(R.string.order_price_total) + ":",
                    color = colors.onSurface
                )

                TextBodyMedium(
                    text = "${orderItems.sumOf { it.price }}${priceUnit}",
                    color = colors.onSurface,
                    layoutOverride = {
                        textAlign = TextAlign.End
                    }
                )
            }
        }
    }
}
