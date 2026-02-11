package com.example.ecohub.main.features.favorites.ui.favorites_view.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.ecohub.main.common.ui.paddingHorizontalScreen
import com.example.ecohub.main.common.ui.shared.ProductCard
import com.example.ecohub.main.common.ui.theme.Locals

@Composable
fun FavoritesViewProductsSelection() {
    val spacing = Locals.spacing

    Column(
        modifier = Modifier
            .paddingHorizontalScreen(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(spacing.screenPadding)
    ) {
        repeat(4) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing.screenPadding)
            ) {
                ProductCard(
                    modifier = Modifier
                        .weight(1f),
                    sale = "20%",
                    liked = true
                )

                ProductCard(
                    modifier = Modifier
                        .weight(1f),
                )
            }
        }
    }
}