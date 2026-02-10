package com.example.ecohub.main.common.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Dimens(
    // Standard spacings
    val xxs: Dp,
    val xs: Dp,
    val sm: Dp,
    val md: Dp,
    val lg: Dp,
    val xl: Dp,
    val xxl: Dp,
    val xxxl: Dp,

    // Screen paddings
    val screenPadding: Dp,
    val contentPadding: Dp,

    // List item spacing
    val itemSpacing: Dp,
    val sectionSpacing: Dp
) {
    companion object {
        fun default() = Dimens(
            xxs = 4.dp,
            xs = 8.dp,
            sm = 12.dp,
            md = 16.dp,
            lg = 24.dp,
            xl = 32.dp,
            xxl = 40.dp,
            xxxl = 48.dp,
            screenPadding = 16.dp,
            contentPadding = 20.dp,
            itemSpacing = 12.dp,
            sectionSpacing = 24.dp
        )
    }
}

val LocalDimens = staticCompositionLocalOf<Dimens> {
    error("Dimens not provided")
}
