package com.example.biblioteca.ui.section

import com.example.biblioteca.ui.composable.ExitoHeader
import com.example.biblioteca.ui.composable.PortadaReserva
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RenovacionResumenSection(
    nombreLibro: String,
    fechaNueva: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ExitoHeader(titulo = "Reserva Renovada")

        Spacer(modifier = Modifier.height(16.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                PortadaReserva(nombreLibro = nombreLibro, alto = 60.dp)

                Spacer(modifier = Modifier.width(16.dp))

                Column {
                    Text(text = "Libro: $nombreLibro")
                    Text(text = "Nueva Fecha: $fechaNueva")
                }
            }
        }
    }
}
