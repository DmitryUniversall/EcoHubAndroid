package com.example.ecohub.main.common.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.ecohub.main.common.ui.theme.locals.Dimens
import com.example.ecohub.main.common.ui.theme.locals.ExtraColors
import com.example.ecohub.main.common.ui.theme.locals.Gradients
import com.example.ecohub.main.common.ui.theme.locals.LightExtraColors
import com.example.ecohub.main.common.ui.theme.locals.LocalDimens
import com.example.ecohub.main.common.ui.theme.locals.LocalExtraColors
import com.example.ecohub.main.common.ui.theme.locals.LocalGradients
import com.example.ecohub.main.common.ui.theme.locals.LocalShapes
import com.example.ecohub.main.common.ui.theme.locals.LocalSpacing
import com.example.ecohub.main.common.ui.theme.locals.Shapes
import com.example.ecohub.main.common.ui.theme.locals.Spacing


object Locals {
    val dimens: Dimens
        @Composable
        get() = LocalDimens.current

    val shapes: Shapes
        @Composable
        get() = LocalShapes.current

    val spacing: Spacing
        @Composable
        get() = LocalSpacing.current

    val extraColors: ExtraColors
        @Composable
        get() = LocalExtraColors.current

    val gradients: Gradients
        @Composable
        get() = LocalGradients.current
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


@Composable
fun EcoHubTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme
    val extraColors = LightExtraColors
    val customDimens = Dimens.default()
    val customShapes = Shapes.default(customDimens)
    val customSpacing = Spacing.default()
    val customGradients = Gradients.default()

    CompositionLocalProvider(
        LocalDimens provides customDimens,
        LocalShapes provides customShapes,
        LocalSpacing provides customSpacing,
        LocalExtraColors provides extraColors,
        LocalGradients provides customGradients
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = AppTypography,
            content = content
        )
    }
}
