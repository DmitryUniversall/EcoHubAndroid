package com.example.ecohub.main.common.theme

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import com.example.ecohub.core.ui.CoreColors

object AppColors {
    val Primary = Color(0xFFFF9800)
    val PrimaryVariant = Color(0xFFFFA726) // lighter orange for highlights
    val OnPrimary = Color.White

    val Secondary = CoreColors.Neutral.Neutral500
    val OnSecondary = Color.White

    val Background = Color(0xFFF7F7F8)
    val Surface = Color(0xFFFFFFFF)
    val SurfaceVariant = Color(0xFFF1F2F4) // pale rounded card background (list of fruits cards)
    val OnBackground = Color(0xFF1F1F1F)   // main text color (title "Red Apple")
    val OnSurface = Color(0xFF111111)      // surface text

    val Muted = Color(0xFF7D7D7D)          // description text, secondary labels (light gray)
    val Outline = Color(0xFFE6E6E6)        // divider / card border color (very light)
    val Rating = Color(0xFFFFC107)         // star color (yellow)
    val Price = Color(0xFF0D0D0D)          // price color (very dark)

    val Success = Color(0xFF2E7D32)
    val Error = Color(0xFFD32F2F)
    val Info = Color(0xFF0288D1)
    val Disabled = Color(0xFFBDBDBD)

    val OnSuccess = Color.White
    val OnError = Color.White
    val OnInfo = Color.White
    val OnDisabled = Color.White
}

val LightColorScheme = lightColorScheme(
    primary = AppColors.Primary,
    onPrimary = AppColors.OnPrimary,
    primaryContainer = AppColors.PrimaryVariant,
    secondary = AppColors.Secondary,
    onSecondary = AppColors.OnSecondary,
    background = AppColors.Background,
    onBackground = AppColors.OnBackground,
    surface = AppColors.Surface,
    onSurface = AppColors.OnSurface,
    surfaceVariant = AppColors.SurfaceVariant,
    outline = AppColors.Outline,
    error = AppColors.Error,
    onError = AppColors.OnError
)
