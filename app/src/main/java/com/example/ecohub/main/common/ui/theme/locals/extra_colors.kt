package com.example.ecohub.main.common.ui.theme.locals

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.example.ecohub.main.common.ui.theme.AppColors


data class ExtraColors(
    val muted: Color,
    val border: Color,
    val heart: Color,
    val sale: Color,
    val delete: Color
)

val LightExtraColors = ExtraColors(
    muted = AppColors.Muted,
    border = AppColors.SurfaceVariant,
    heart = AppColors.HeartRed,
    sale = AppColors.PrimaryVariant,
    delete = AppColors.Error
)

val LocalExtraColors = staticCompositionLocalOf<ExtraColors> {
    error("ExtraColors not provided")
}
