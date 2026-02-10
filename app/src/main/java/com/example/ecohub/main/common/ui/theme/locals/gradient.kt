package com.example.ecohub.main.common.ui.theme.locals

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

@Immutable
data class Gradients(
    val primaryLeft: Brush
) {
    companion object {
        fun default(): Gradients = Gradients(
            primaryLeft = Brush.linearGradient(
                colors = listOf(
                    Color(0xFFFFA400),
                    Color(0xFFFFAB07),
                    Color(0xFFFFAB07)
                ),
                start = Offset.Zero,
                end = Offset.Infinite
            )
        )
    }
}

val LocalGradients = staticCompositionLocalOf<Gradients> {
    error("Gradients was not provided")
}
