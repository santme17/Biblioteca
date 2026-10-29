package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.composable.PortadaReserva

@Composable
fun FormularioRenovacionSection(
    nombreLibro: String,
    fechaReserva: String,
    fechaNueva: String,
    onFechaNuevaChange: (String) -> Unit,
    onConfirmar: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        PortadaReserva(
            nombreLibro = nombreLibro,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Libro: $nombreLibro",
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = "Reserva Actual: $fechaReserva")

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = fechaNueva,
            onValueChange = onFechaNuevaChange,
            label = { Text("Nueva Fecha") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onConfirmar,
            enabled = fechaNueva.isNotBlank(),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Confirmar Renovación")
        }
    }
}
