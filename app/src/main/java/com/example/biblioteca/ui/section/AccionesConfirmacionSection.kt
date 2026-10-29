package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccionesConfirmacionSection(
    onVolverInicio: () -> Unit,
    onVerReservas: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Button(
            onClick = onVolverInicio,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Volver al Inicio")
        }

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedButton(
            onClick = onVerReservas,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver Mis Reservas")
        }
    }
}
