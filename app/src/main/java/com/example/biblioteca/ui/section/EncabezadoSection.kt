package com.example.biblioteca.ui.section

import androidx.compose.runtime.Composable
import com.example.biblioteca.ui.composable.BarraSuperior

@Composable
fun EncabezadoSection(titulo: String, onVolver: (() -> Unit)? = null) {
    BarraSuperior(titulo = titulo, onVolver = onVolver)
}
