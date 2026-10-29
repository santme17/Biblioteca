package com.example.biblioteca.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R
import com.example.biblioteca.ui.component.BarraSuperior

@Composable
fun DetalleLibroScreen(
    nombreLibro: String,
    onReservar: (String, String) -> Unit,
    onVolver: () -> Unit
) {
    val imagen = when (nombreLibro) {
        "Clean Code" -> R.drawable.portada_clean_code
        "Kotlin para Android" -> R.drawable.ic_libro_kotlin
        "Arquitectura de Software" -> R.drawable.ic_libro_arquitectura
        else -> R.drawable.ic_libro_compose
    }

    Column(modifier = Modifier.fillMaxSize()) {
        BarraSuperior(titulo = "Detalle del Libro", onVolver = onVolver)

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = imagen),
                contentDescription = "Imagen de $nombreLibro",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(width = 150.dp, height = 200.dp)
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