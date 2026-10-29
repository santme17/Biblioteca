package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun VerLibrosSection(onVerLibros: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onVerLibros,
        modifier = modifier.fillMaxWidth()
    ) {
        Text("Ver Libros")
    }
}
