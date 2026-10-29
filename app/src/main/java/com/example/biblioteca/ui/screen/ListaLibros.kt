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
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.biblioteca.R

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
        BarraSuperior(titulo = "Mis Libros", onVolver = onVolver)

        Text(
            text = "Elige un libro para ver más detalles.",
            modifier = Modifier.padding(16.dp)
        )

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(libros) { (nombreLibro, icono) ->
                Card(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = icono),
                            contentDescription = nombreLibro,
                            modifier = Modifier.size(40.dp)
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = nombreLibro,
                            style = MaterialTheme.typography.titleMedium,
                            modifier = Modifier.weight(1f)
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