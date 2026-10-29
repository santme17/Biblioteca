package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.section.EncabezadoSection
import com.example.biblioteca.ui.section.ReservaItemSection

@Composable
fun MisReservasScreen(
    onVerReserva: (String, String, String) -> Unit,
    onVolver: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        EncabezadoSection(titulo = "Mis Reservas", onVolver = onVolver)

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Lista de reservas activas",
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(12.dp))
            ReservaItemSection(onVerReserva = onVerReserva)
        }
    }
}
