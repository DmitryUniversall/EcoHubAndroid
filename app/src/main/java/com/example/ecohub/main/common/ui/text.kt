package com.example.ecohub.main.common.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TextTitle(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.displaySmall
    )
}

@Composable
fun TextBody(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.bodyMedium
    )
}

@Composable
fun TextSecondary(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.bodySmall,
        color = MaterialTheme.colorScheme.onSurfaceVariant
    )
}

@Composable
fun TextOnSurface(text: String) {
    Text(
        text,
        style = MaterialTheme.typography.bodySmall,
        color = MaterialTheme.colorScheme.onSurface
    )
}