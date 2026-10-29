package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun VolverReservasSection(onVolverReservas: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = onVolverReservas,
        modifier = modifier.fillMaxWidth()
    ) {
        Text("Volver a Mis Reservas")
    }
}
