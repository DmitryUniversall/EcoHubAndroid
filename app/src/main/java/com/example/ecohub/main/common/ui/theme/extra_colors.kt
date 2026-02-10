package com.example.ecohub.main.common.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color


data class ExtraColors(
    val muted: Color,
    val border: Color
)

val LightExtraColors = ExtraColors(
    muted = AppColors.Muted,
    border = AppColors.Muted
)

val LocalExtraColors = staticCompositionLocalOf<ExtraColors> {
    error("ExtraColors not provided")
}
