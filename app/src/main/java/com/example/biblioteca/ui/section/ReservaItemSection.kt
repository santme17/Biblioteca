package com.example.biblioteca.ui.section

import com.example.biblioteca.ui.composable.PortadaReserva
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ReservaItemSection(
    onVerReserva: (String, String, String) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            PortadaReserva(nombreLibro = "Clean Code")

            Spacer(modifier = Modifier.width(16.dp))

            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Libro: Clean Code")
                Text(text = "Fecha: 15/06/2026")
                Text(text = "Estado: Activa")

                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    onClick = { onVerReserva("Clean Code", "15/06/2026", "RES-2026-001") },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Ver Reserva")
                }
            }
        }
    }
}
