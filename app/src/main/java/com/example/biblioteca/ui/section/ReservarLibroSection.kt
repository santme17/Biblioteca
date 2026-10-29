package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ReservarLibroSection(
    nombreLibro: String,
    onReservar: (String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { onReservar(nombreLibro, "15/06/2026") },
        modifier = modifier.fillMaxWidth()
    ) {
        Text("Reservar Libro")
    }
}
