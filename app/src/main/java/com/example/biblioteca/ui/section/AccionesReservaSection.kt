package com.example.biblioteca.ui.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AccionesReservaSection(
    onRenovar: () -> Unit,
    onCancelar: () -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(onClick = onRenovar, modifier = Modifier.weight(1f)) {
            Text("Renovar Reserva")
        }
        OutlinedButton(onClick = onCancelar, modifier = Modifier.weight(1f)) {
            Text("Cancelar Reserva")
        }
    }
}
