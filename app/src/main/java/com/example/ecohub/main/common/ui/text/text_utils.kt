package com.example.ecohub.main.common.ui.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun TextDisplayLarge(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.displayLarge,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)

@Composable
fun TextDisplayMedium(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.displayMedium,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)

@Composable
fun TextDisplaySmall(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.displaySmall,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)

@Composable
fun TextHeadlineLarge(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.headlineLarge,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)

@Composable
fun TextHeadlineMedium(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.headlineMedium,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)

@Composable
fun TextHeadlineSmall(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.headlineSmall,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)


@Composable
fun TextBodyLarge(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) {

    AppText(
        text = text,
        style = MaterialTheme.typography.bodyLarge,
        modifier = modifier,
        color = color,
        override = override,
        layout = layout
    )
}

@Composable
fun TextBodyMedium(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.bodyMedium,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)

@Composable
fun TextBodySmall(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) = AppText(
    text = text,
    style = MaterialTheme.typography.bodySmall,
    modifier = modifier,
    color = color,
    override = override,
    layout = layout
)
