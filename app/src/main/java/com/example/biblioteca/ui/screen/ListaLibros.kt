package com.example.biblioteca.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.biblioteca.ui.component.BarraSuperior

@Composable
fun ListaLibrosScreen(
    onVerDetalle: (String) -> Unit,
    onVolver: () -> Unit
) {

    val libros = listOf(
        "Clean Code",
        "Kotlin para Android",
        "Arquitectura de Software",
        "Jetpack Compose"
    )

    Column(modifier = Modifier.fillMaxSize()) {
        BarraSuperior(titulo = "Mis Libros", onVolver = onVolver)

        Text(
            text = "Elige un libro para ver más detalles.",
            modifier = Modifier.padding(16.dp)
        )

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(libros) { nombreLibro ->
                Card(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = nombreLibro,
                            style = MaterialTheme.typography.titleMedium
                        )
                        OutlinedButton(onClick = { onVerDetalle(nombreLibro) }) {
                            Text("Ver Detalle")
                        }
                    }
                }
            }
        }
    }
}