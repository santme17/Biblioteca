package com.example.biblioteca.navegation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.biblioteca.ui.screen.InicioScreen
import com.example.biblioteca.ui.screen.ListaLibrosScreen
import com.example.biblioteca.ui.screen.DetalleLibroScreen
import com.example.biblioteca.ui.screen.ConfirmacionScreen

@Composable
fun AppNavegation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Inicio,
        modifier = modifier
    ) {
        composable<Inicio> {
            InicioScreen(
                onVerLibros = { navController.navigate(ListaLibros) }
            )
        }

        composable<ListaLibros> {
            ListaLibrosScreen(
                onVerDetalle = { nombre: String -> navController.navigate(DetalleLibro(nombre)) },
                onVolver = { navController.popBackStack() }
            )
        }

        composable<DetalleLibro> { entry ->
            val args = entry.toRoute<DetalleLibro>()
            DetalleLibroScreen(
                nombreLibro = args.nombreLibro,
                onReservar = { libro: String, fecha: String ->
                    navController.navigate(Confirmacion(libro, fecha))
                },
                onVolver = { navController.popBackStack() }
            )
        }

        composable<Confirmacion> { entry ->
            val args = entry.toRoute<Confirmacion>()
            ConfirmacionScreen(
                nombreLibro = args.nombreLibro,
                fecha = args.fecha,
                onVolverInicio = {
                    navController.popBackStack(Inicio, inclusive = false)
                },
                onVerReservas = {
                    /* Se conectará en la siguiente rama feature/flujo-reservas */
                }
            )
        }
    }
}