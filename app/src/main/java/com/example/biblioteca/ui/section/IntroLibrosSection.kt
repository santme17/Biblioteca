package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun IntroLibrosSection(modifier: Modifier = Modifier) {
    Text(
        text = "Elige un libro para ver más detalles.",
        modifier = modifier.padding(16.dp)
    )
}
