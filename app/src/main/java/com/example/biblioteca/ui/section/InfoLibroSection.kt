package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun InfoLibroSection(nombreLibro: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Parámetro recibido: $nombreLibro",
            style = MaterialTheme.typography.labelLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Nombre: $nombreLibro")
        Text(text = "Autor: Autor Ejemplo")
        Text(text = "Categoría: Programación")

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Descripción:",
            style = MaterialTheme.typography.titleSmall
        )
        Text(text = "Guía práctica y detallada para el desarrollo de software. Un clásico imprescindible para desarrolladores.")
    }
}
