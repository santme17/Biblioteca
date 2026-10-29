package com.example.biblioteca.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.component.BarraSuperior

@Composable
fun RenovarReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    onConfirmar: (String) -> Unit,
    onVolver: () -> Unit
) {
    var fechaNueva by remember { mutableStateOf("30/06/2026") }

    Column(modifier = Modifier.fillMaxSize()) {
        BarraSuperior(titulo = "Renovar Reserva", onVolver = onVolver)

        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.portada_clean_code),
                contentDescription = "Portada de $nombreLibro",
                modifier = Modifier
                    .height(120.dp)
                    .aspectRatio(138f / 188f)
                    .align(Alignment.CenterHorizontally)
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
                onValueChange = { fechaNueva = it },
                label = { Text("Nueva Fecha") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { onConfirmar(fechaNueva) },
                enabled = fechaNueva.isNotBlank(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Confirmar Renovación")
            }
        }
    }
}