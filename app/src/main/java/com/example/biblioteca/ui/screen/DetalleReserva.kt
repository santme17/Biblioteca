package com.example.biblioteca.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.component.BarraSuperior

@Composable
fun DetalleReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    codigoReserva: String,
    onRenovar: () -> Unit,
    onCancelar: () -> Unit,
    onVolver: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        BarraSuperior(titulo = "Detalle de Reserva", onVolver = onVolver)

        Column(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.portada_clean_code),
                contentDescription = "Portada de $nombreLibro",
                modifier = Modifier
                    .height(120.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Argumentos recibidos",
                style = MaterialTheme.typography.labelLarge
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(text = "Nombre: $nombreLibro")
            Text(text = "Autor: Autor Ejemplo")
            Text(text = "Fecha Reserva: $fechaReserva")
            Text(text = "Código Reserva: $codigoReserva")
            Text(text = "Estado: Activa")

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Estos datos fueron enviados desde la pantalla anterior como parámetros.",
                style = MaterialTheme.typography.bodySmall
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = onRenovar, modifier = Modifier.weight(1f)) {
                    Text("Renovar Reserva")
                }
                OutlinedButton(onClick = onCancelar, modifier = Modifier.weight(1f)) {
                    Text("Cancelar Reserva")
                }
            }
        }
    }
}