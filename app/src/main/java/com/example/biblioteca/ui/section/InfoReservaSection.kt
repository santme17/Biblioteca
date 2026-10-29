package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.composable.PortadaReserva

@Composable
fun InfoReservaSection(
    nombreLibro: String,
    fechaReserva: String,
    codigoReserva: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        PortadaReserva(
            nombreLibro = nombreLibro,
            modifier = Modifier.align(Alignment.CenterHorizontally)
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
    }
}
