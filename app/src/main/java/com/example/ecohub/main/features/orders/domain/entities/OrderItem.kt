package com.example.ecohub.main.features.orders.domain.entities

data class OrderItem(
    val title: String,
    val quantity: Int,
    val price: Double,
    val priceUnit: String  // TODO: Price unit convert
)
