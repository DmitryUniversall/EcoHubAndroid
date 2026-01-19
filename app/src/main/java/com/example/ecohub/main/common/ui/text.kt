package com.example.ecohub.main.common.ui

import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit

data class TextSecondaryOptions(
    val autoSize: TextAutoSize? = null,
    val letterSpacing: TextUnit = TextUnit.Unspecified,
    val textDecoration: TextDecoration? = null,
    val textAlign: TextAlign? = null,
    val overflow: TextOverflow = TextOverflow.Clip,
    val softWrap: Boolean = true,
    val maxLines: Int = Int.MAX_VALUE,
    val minLines: Int = 1,
    val onTextLayout: ((TextLayoutResult) -> Unit)? = null
)

@Composable
fun StyledTextWithSecondaryOptions(
    text: String,
    style: TextStyle,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) =
    Text(
        text = text,
        modifier = modifier,
        color = color,
        style = style,
        autoSize = secondaryOptions.autoSize,
        letterSpacing = secondaryOptions.letterSpacing,
        textDecoration = secondaryOptions.textDecoration,
        textAlign = secondaryOptions.textAlign,
        overflow = secondaryOptions.overflow,
        softWrap = secondaryOptions.softWrap,
        maxLines = secondaryOptions.maxLines,
        minLines = secondaryOptions.minLines,
        onTextLayout = secondaryOptions.onTextLayout,
    )

@Composable
fun TextD1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.displayLarge,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextD2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.displayMedium,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextD3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.displaySmall,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextH1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.headlineLarge,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextH2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.headlineMedium,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextB1(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.bodyLarge,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextB2(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.bodyMedium,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextB3(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = Color.Unspecified,
    secondaryOptions: TextSecondaryOptions = TextSecondaryOptions()
) = StyledTextWithSecondaryOptions(
    text = text,
    style = MaterialTheme.typography.bodySmall,
    modifier = modifier,
    color = color,
    secondaryOptions = secondaryOptions
)

@Composable
fun TextOnSurface(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.bodySmall,
        color = MaterialTheme.colorScheme.onSurface
    )
}
