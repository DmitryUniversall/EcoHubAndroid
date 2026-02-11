package com.example.ecohub.main.features.home.ui.home_view.components.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ecohub.main.common.ui.paddingHorizontalScreen
import com.example.ecohub.main.common.ui.paddingScreen
import com.example.ecohub.main.common.ui.paddingTopMD
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.features.home.ui.home_view.components.content.selections.HomeViewCategoriesSelection
import com.example.ecohub.main.features.home.ui.home_view.components.content.selections.HomeViewProductsSelection
import com.example.ecohub.main.common.ui.shared.SearchSelection


@Composable
fun HomeViewContent() {
    val spacing = Locals.spacing

    Column(
        modifier = Modifier
            .padding(top=(200 / 2 + spacing.screenPadding.value).dp),
        verticalArrangement = Arrangement.spacedBy(spacing.md)
    ) {
        SearchSelection()
        HomeViewCategoriesSelection()
        HomeViewProductsSelection()
    }
}
