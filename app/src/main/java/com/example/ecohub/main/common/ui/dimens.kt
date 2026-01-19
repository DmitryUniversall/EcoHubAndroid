package com.example.ecohub.main.common.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.ecohub.main.common.theme.Dimens

@Composable
fun Modifier.paddingXs(): Modifier = this.padding(all = Dimens.xs)

@Composable
fun Modifier.paddingSm(): Modifier = this.padding(all = Dimens.sm)

@Composable
fun Modifier.paddingMd(): Modifier = this.padding(all = Dimens.md)
