package com.example.ecohub.main.features.favorites.ui.favorites_view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ecohub.main.common.ui.shared.SearchSelection
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.features.favorites.ui.favorites_view.components.FavoritesViewProductsSelection

@Composable
fun FavoritesView(
    layoutPadding: PaddingValues
) {
    val spacing = Locals.spacing

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = layoutPadding.calculateTopPadding())
            .verticalScroll(scrollState),
    ) {
        Column(
            modifier = Modifier.padding(bottom = layoutPadding.calculateBottomPadding()),
            verticalArrangement = Arrangement.spacedBy(spacing.screenPadding)
        ) {
            SearchSelection()
            FavoritesViewProductsSelection()
        }
    }
}
