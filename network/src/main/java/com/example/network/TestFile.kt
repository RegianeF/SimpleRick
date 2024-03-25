package com.example.network

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text

@Composable
fun TestFile(modifier: Modifier = Modifier) {
    Text(
        text = "Hello world! From another module ;)",
        modifier = modifier
    )
}