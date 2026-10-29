package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.section.EncabezadoSection
import com.example.biblioteca.ui.section.InfoLibroSection
import com.example.biblioteca.ui.section.PortadaLibroSection
import com.example.biblioteca.ui.section.ReservarLibroSection

@Composable
fun DetalleLibroScreen(
    nombreLibro: String,
    onReservar: (String, String) -> Unit,
    onVolver: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        EncabezadoSection(titulo = "Detalle del Libro", onVolver = onVolver)

        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(16.dp)
        ) {
            PortadaLibroSection(
                nombreLibro = nombreLibro,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            InfoLibroSection(nombreLibro = nombreLibro)
            Spacer(modifier = Modifier.height(24.dp))
            ReservarLibroSection(nombreLibro = nombreLibro, onReservar = onReservar)
        }
    }
}
