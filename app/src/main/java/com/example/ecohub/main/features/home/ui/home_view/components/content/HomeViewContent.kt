package com.example.ecohub.main.features.home.ui.home_view.components.content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ecohub.main.common.ui.paddingTopMD
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.features.home.ui.home_view.components.content.selections.HomeViewCategoriesSelection
import com.example.ecohub.main.features.home.ui.home_view.components.content.selections.HomeViewSearchSelection


@Composable
fun HomeViewContent() {
    val spacing = Locals.spacing

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paddingTopMD(),
        verticalArrangement = Arrangement.spacedBy(spacing.md)
    ) {
        HomeViewSearchSelection()
        HomeViewCategoriesSelection()
    }
}
