package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.component.BarraSuperior
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.biblioteca.R
import androidx.compose.ui.Alignment
@Composable
fun DetalleLibroScreen(
    nombreLibro: String,
    onReservar: (String, String) -> Unit,
    onVolver: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        BarraSuperior(titulo = "Detalle del Libro", onVolver = onVolver)

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.portada_clean_code),
                contentDescription = "Portada de $nombreLibro",
                modifier = Modifier
                    .height(200.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Parámetro recibido: $nombreLibro",
                style = MaterialTheme.typography.labelLarge
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "Nombre: $nombreLibro")
            Text(text = "Autor: Autor Ejemplo")
            Text(text = "Categoría: Programación")

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Descripción:",
                style = MaterialTheme.typography.titleSmall
            )
            Text(text = "Guía práctica y detallada para el desarrollo de software. Un clásico imprescindible para desarrolladores.")

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { onReservar(nombreLibro, "15/06/2026") },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Reservar Libro")
            }
        }
    }
}