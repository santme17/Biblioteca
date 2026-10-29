package com.example.biblioteca.ui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ExitoHeader(titulo: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = null,
            modifier = Modifier.size(96.dp),
            tint = MaterialTheme.colorScheme.primary
        )

        Text(
            text = titulo,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}
