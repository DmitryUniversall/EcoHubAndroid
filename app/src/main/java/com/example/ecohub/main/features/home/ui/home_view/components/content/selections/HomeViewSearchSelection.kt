package com.example.ecohub.main.features.home.ui.home_view.components.content.selections

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.adamglin.PhosphorIcons
import com.adamglin.phosphoricons.Regular
import com.adamglin.phosphoricons.regular.MagnifyingGlass
import com.adamglin.phosphoricons.regular.SlidersHorizontal
import com.example.ecohub.R
import com.example.ecohub.main.common.ui.paddingHorizontalMD
import com.example.ecohub.main.common.ui.text.TextBodyLarge
import com.example.ecohub.main.common.ui.theme.Locals
import com.example.ecohub.main.common.ui.withShapedBackground

@Composable
fun HomeViewSearchSelection() {
    val shapes = Locals.shapes
    val dimens = Locals.dimens
    val spacing = Locals.spacing
    val extraColors = Locals.extraColors
    val colors = MaterialTheme.colorScheme

    Row(
        modifier = Modifier
            .height(48.dp)
            .fillMaxWidth()
            .withShapedBackground(
                color = colors.surface,
                shape = shapes.roundedPill
            )
            .border(
                border = BorderStroke(1.dp, color = extraColors.border),
                shape = shapes.roundedPill
            )
            .paddingHorizontalMD(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(spacing.sm)
    ) {
        Icon(
            modifier = Modifier.size(dimens.lg),
            imageVector = PhosphorIcons.Regular.MagnifyingGlass,
            contentDescription = null,
            tint = colors.onSurface
        )

        SearchField()

        Icon(
            modifier = Modifier.size(dimens.lg),
            imageVector = PhosphorIcons.Regular.SlidersHorizontal,
            contentDescription = null,
            tint = colors.onSurface
        )
    }
}

@Composable
private fun RowScope.SearchField() {
    var tempSearchValue by remember { mutableStateOf("") }

    val typography = MaterialTheme.typography
    val colors = MaterialTheme.colorScheme
    val extraColors = Locals.extraColors

    BasicTextField(
        value = tempSearchValue,
        onValueChange = { tempSearchValue = it },
        singleLine = true,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        cursorBrush = SolidColor(colors.onSurface),
        textStyle = typography.bodyLarge,
        modifier = Modifier
            .weight(1f)
            .fillMaxHeight(),
        decorationBox = { innerTextField ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colors.surface),
                contentAlignment = Alignment.CenterStart
            ) {
                if (tempSearchValue.isEmpty()) {
                    TextBodyLarge(
                        text = stringResource(R.string.search_product_placehoder),
                        color = extraColors.muted
                    )
                }

                innerTextField()
            }
        }
    )
}
