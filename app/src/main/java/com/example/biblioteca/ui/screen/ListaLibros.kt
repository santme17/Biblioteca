package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.biblioteca.R
import com.example.biblioteca.ui.section.EncabezadoSection
import com.example.biblioteca.ui.section.IntroLibrosSection
import com.example.biblioteca.ui.section.ListaLibrosSection

@Composable
fun ListaLibrosScreen(
    onVerDetalle: (String) -> Unit,
    onVolver: () -> Unit
) {
    val libros = listOf(
        "Clean Code" to R.drawable.ic_libro_clean_code,
        "Kotlin para Android" to R.drawable.ic_libro_kotlin,
        "Arquitectura de Software" to R.drawable.ic_libro_arquitectura,
        "Jetpack Compose" to R.drawable.ic_libro_compose
    )

    Column(modifier = Modifier.fillMaxSize()) {
        EncabezadoSection(titulo = "Mis Libros", onVolver = onVolver)
        IntroLibrosSection()
        ListaLibrosSection(libros = libros, onVerDetalle = onVerDetalle)
    }
}
