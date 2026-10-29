package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.section.AccionesConfirmacionSection
import com.example.biblioteca.ui.section.ResumenReservaSection

@Composable
fun ConfirmacionScreen(
    nombreLibro: String,
    fecha: String,
    onVolverInicio: () -> Unit,
    onVerReservas: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ResumenReservaSection(nombreLibro = nombreLibro, fecha = fecha)
        Spacer(modifier = Modifier.height(24.dp))
        AccionesConfirmacionSection(
            onVolverInicio = onVolverInicio,
            onVerReservas = onVerReservas
        )
    }
}
