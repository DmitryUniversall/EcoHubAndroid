package com.example.ecohub.main.features.orders.ui.orders_view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.features.orders.domain.entities.OrderItem
import com.example.ecohub.main.features.orders.domain.entities.OrderStatus
import com.example.ecohub.main.features.orders.ui.orders_view.components.OrderCard
import java.time.LocalDateTime
import java.util.UUID

@Composable
fun OrdersView(
    layoutPadding: PaddingValues
) {
    val spacing = Locals.spacing
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    top = layoutPadding.calculateTopPadding() + spacing.screenPadding,
                    bottom = layoutPadding.calculateBottomPadding() + spacing.screenPadding,
                    start = spacing.screenPadding,
                    end = spacing.screenPadding
                ),
            verticalArrangement = Arrangement.spacedBy(spacing.screenPadding)
        ) {
            OrderCard(
                orderId = UUID.randomUUID().toString(),
                status = OrderStatus.PENDING,
                createdAt = LocalDateTime.now(),
                deliveryAddress = "Random st. Moscow",
                priceUnit = "$",
                orderItems = listOf(
                    OrderItem(
                        title = "Test",
                        quantity = 1,
                        price = 2.5,
                        priceUnit = "$"
                    ),
                    OrderItem(
                        title = "Test2",
                        quantity = 4,
                        price = 3.0,
                        priceUnit = "$"
                    ),
                    OrderItem(
                        title = "Test3",
                        quantity = 7,
                        price = 7.2,
                        priceUnit = "$"
                    )
                )
            )
            OrderCard(
                orderId = UUID.randomUUID().toString(),
                status = OrderStatus.PENDING,
                createdAt = LocalDateTime.now(),
                deliveryAddress = "Random st. Moscow",
                priceUnit = "$",
                orderItems = listOf(
                    OrderItem(
                        title = "Test",
                        quantity = 1,
                        price = 2.5,
                        priceUnit = "$"
                    ),
                    OrderItem(
                        title = "Test2",
                        quantity = 4,
                        price = 3.0,
                        priceUnit = "$"
                    ),
                    OrderItem(
                        title = "Test3",
                        quantity = 7,
                        price = 7.2,
                        priceUnit = "$"
                    )
                )
            )
            OrderCard(
                orderId = UUID.randomUUID().toString(),
                status = OrderStatus.PENDING,
                createdAt = LocalDateTime.now(),
                deliveryAddress = "Random st. Moscow",
                priceUnit = "$",
                orderItems = listOf(
                    OrderItem(
                        title = "Test",
                        quantity = 1,
                        price = 2.5,
                        priceUnit = "$"
                    ),
                    OrderItem(
                        title = "Test2",
                        quantity = 4,
                        price = 3.0,
                        priceUnit = "$"
                    ),
                    OrderItem(
                        title = "Test3",
                        quantity = 7,
                        price = 7.2,
                        priceUnit = "$"
                    )
                )
            )
        }
    }
}
