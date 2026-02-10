package com.example.ecohub.main.features.home.ui.home_view.components.content.selections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.example.ecohub.R
import com.example.ecohub.main.common.ui.paddingMD
import com.example.ecohub.main.common.ui.paddingSM
import com.example.ecohub.main.common.ui.paddingXXS
import com.example.ecohub.main.common.ui.shimmer
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.text.TextBodyMedium
import com.example.ecohub.main.common.ui.text.TextBodySmall
import com.example.ecohub.main.common.ui.text.TextHeadlineMedium
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground

@Composable
fun HomeViewCategoriesSelection() {
    val spacing = Locals.spacing
    val extraColors = Locals.extraColors

    val listState = rememberLazyListState()

    val cards = listOf(
        "All" to true,
        "Veggies" to false,
        "Meat" to false,
        "Fruits" to false,
        "Fish" to false
    )

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(spacing.md),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            TextHeadlineMedium(
                text = stringResource(R.string.categories_headline),
                override = {
                    fontWeight = FontWeight.SemiBold
                }
            )
            TextBodyLarge(
                text = stringResource(R.string.see_all_categories),
                color = extraColors.muted,
                override = {
                    fontWeight = FontWeight.SemiBold
                }
            )
        }

        LazyRow(  // TODO: Remove screen padding for items to scroll off screen
            state = listState,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(spacing.xs)
        ) {
            items(cards) { card ->
                CategoryCard(
                    title = card.first,
                    selected = card.second
                )
            }
        }
    }
}

@Composable
fun CategoryCard(
    title: String,
    selected: Boolean
) {
    val shapes = Locals.shapes
    val spacing = Locals.spacing
    val extraColors = Locals.extraColors
    val colors = MaterialTheme.colorScheme

    Column(
        modifier = Modifier
            .width(80.dp)
            .height(100.dp)
            .withShapedBackground(
                color = if (selected) colors.primary else colors.surface,
                shape = shapes.roundedMD
            )
            .paddingMD(),
        verticalArrangement = Arrangement.spacedBy(spacing.sm),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .withShapedBackground(
                    color = colors.surface,
                    shape = shapes.roundedPill
                ),
            contentAlignment = Alignment.Center
        ) {
            SubcomposeAsyncImage(
                modifier = Modifier
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
        }

        TextBodySmall(
            text = title,
            color = if (selected) colors.onPrimary else extraColors.muted
        )
    }
}