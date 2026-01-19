package com.example.ecohub.main.common.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import com.example.ecohub.main.common.theme.Dimens

@Composable
fun Modifier.objectClickable(onClick: () -> Unit) =
    this.clickable(
        indication = ripple(),
        interactionSource = remember { MutableInteractionSource() },
        onClick = onClick
    )

fun Modifier.withShapedBackground(
    color: Color,
    shape: Shape
) =
    this
        .background(color = color, shape = shape)
        .clip(shape = shape)

fun Modifier.withShapedBackground(
    brush: Brush,
    shape: Shape = RectangleShape,
) =
    this
        .background(brush = brush, shape = shape)
        .clip(shape = shape)

fun Modifier.paddingScreenHorizontal() = this.padding(horizontal = Dimens.screenPadding)

@Composable
fun Modifier.backgroundBackground() = this.background(color = MaterialTheme.colorScheme.background)

@Composable
fun Modifier.backgroundSurface() = this.background(color = MaterialTheme.colorScheme.surface)

@Composable
fun Modifier.backgroundPrimary() = this.background(color = MaterialTheme.colorScheme.primary)
