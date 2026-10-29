package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.section.EncabezadoSection
import com.example.biblioteca.ui.section.AccionesReservaSection
import com.example.biblioteca.ui.section.InfoReservaSection

@Composable
fun DetalleReservaScreen(
    nombreLibro: String,
    fechaReserva: String,
    codigoReserva: String,
    onRenovar: () -> Unit,
    onCancelar: () -> Unit,
    onVolver: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        EncabezadoSection(titulo = "Detalle de Reserva", onVolver = onVolver)

        Column(modifier = Modifier.padding(16.dp)) {
            InfoReservaSection(
                nombreLibro = nombreLibro,
                fechaReserva = fechaReserva,
                codigoReserva = codigoReserva
            )
            Spacer(modifier = Modifier.height(24.dp))
            AccionesReservaSection(onRenovar = onRenovar, onCancelar = onCancelar)
        }
    }
}
