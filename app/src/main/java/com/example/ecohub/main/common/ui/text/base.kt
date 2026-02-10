package com.example.ecohub.main.common.ui.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle

@Composable
fun AppText(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    override: (TextOverrides.Builder.() -> Unit)? = null,
    layout: TextLayoutOptions = TextLayoutOptions()
) {
    val overrides = if (override == null) TextOverrides() else TextOverrides.Builder().apply(override).build()

    Text(
        text = text,
        modifier = modifier,
        color = color,
        style = overrides.applyTo(style),
        textAlign = layout.textAlign,
        overflow = layout.overflow,
        softWrap = layout.softWrap,
        maxLines = layout.maxLines,
        minLines = layout.minLines,
        onTextLayout = layout.onTextLayout
    )
}
