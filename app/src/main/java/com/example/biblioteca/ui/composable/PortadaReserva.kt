package com.example.biblioteca.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.biblioteca.R

@Composable
fun PortadaReserva(
    nombreLibro: String,
    modifier: Modifier = Modifier,
    alto: Dp = 120.dp
) {
    Image(
        painter = painterResource(id = R.drawable.portada_clean_code),
        contentDescription = "Portada de $nombreLibro",
        modifier = modifier
            .height(alto)
            .aspectRatio(138f / 188f)
    )
}
