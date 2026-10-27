package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ConfirmacionScreen(
    nombreLibro: String,
    fecha: String,
    onVolverInicio: () -> Unit,
    onVerReservas: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = null,
            modifier = Modifier.size(96.dp),
            tint = MaterialTheme.colorScheme.primary
        )

        Text(
            text = "Reserva Exitosa",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Libro: $nombreLibro")
                Text(text = "Fecha: $fecha")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = onVolverInicio,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver al Inicio")
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            onClick = onVerReservas,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver Mis Reservas")
        }
    }
}