package com.example.biblioteca.ui.section

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R

@Composable
fun PortadaLibroSection(nombreLibro: String, modifier: Modifier = Modifier) {
    val imagen = when (nombreLibro) {
        "Clean Code" -> R.drawable.portada_clean_code
        "Kotlin para Android" -> R.drawable.ic_libro_kotlin
        "Arquitectura de Software" -> R.drawable.ic_libro_arquitectura
        else -> R.drawable.ic_libro_compose
    }

    Image(
        painter = painterResource(id = imagen),
        contentDescription = "Imagen de $nombreLibro",
        contentScale = ContentScale.Fit,
        modifier = modifier.size(width = 150.dp, height = 200.dp)
    )
}
