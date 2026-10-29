package com.example.biblioteca.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.component.BarraSuperior

@Composable
fun MisReservasScreen(
    onVerReserva: (String, String, String) -> Unit,
    onVolver: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        BarraSuperior(titulo = "Mis Reservas", onVolver = onVolver)

        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Lista de reservas activas",
                style = MaterialTheme.typography.titleMedium
            )
            Spacer(modifier = Modifier.height(12.dp))

            Card(modifier = Modifier.fillMaxWidth()) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.portada_clean_code),
                        contentDescription = "Portada de Clean Code",
                        modifier = Modifier.height(120.dp)
                    )

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
    }
}