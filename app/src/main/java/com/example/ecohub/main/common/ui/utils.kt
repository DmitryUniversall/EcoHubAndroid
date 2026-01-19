package com.example.ecohub.main.common.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

@Composable
fun Modifier.objectClickable(onClick: () -> Unit) =
    this.clickable(
        indication = ripple(),
        interactionSource = remember { MutableInteractionSource() },
        onClick = onClick
    )


@Composable
fun Modifier.roundedPill() =
    this.clip(
        shape = MaterialTheme.shapes.extraLarge
    )

@Composable
fun Modifier.roundedMedium() =
    this.clip(
        shape = MaterialTheme.shapes.medium
    )
