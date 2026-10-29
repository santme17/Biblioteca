package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.section.EncabezadoSection
import com.example.biblioteca.ui.section.FormularioRenovacionSection

@Composable
fun RenovarReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    onConfirmar: (String) -> Unit,
    onVolver: () -> Unit
) {
    var fechaNueva by remember { mutableStateOf("30/06/2026") }

    Column(modifier = Modifier.fillMaxSize()) {
        EncabezadoSection(titulo = "Renovar Reserva", onVolver = onVolver)

        Column(modifier = Modifier.padding(16.dp)) {
            FormularioRenovacionSection(
                nombreLibro = nombreLibro,
                fechaReserva = fechaReserva,
                fechaNueva = fechaNueva,
                onFechaNuevaChange = { fechaNueva = it },
                onConfirmar = { onConfirmar(fechaNueva) }
            )
        }
    }
}
