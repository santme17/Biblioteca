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
import com.example.biblioteca.ui.screen.MisReservasScreen
import com.example.biblioteca.ui.screen.DetalleReservaScreen
import com.example.biblioteca.ui.screen.RenovarReservaScreen
import com.example.biblioteca.ui.screen.RenovacionExitosaScreen

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
                    navController.navigate(MisReservas)
                }
            )
        }

        composable<MisReservas> {
            MisReservasScreen(
                onVerReserva = { libro: String, fecha: String, codigo: String ->
                    navController.navigate(DetalleReserva(libro, fecha, codigo))
                },
                onVolver = { navController.popBackStack() }
            )
        }

        composable<DetalleReserva> { entry ->
            val args = entry.toRoute<DetalleReserva>()
            DetalleReservaScreen(
                nombreLibro = args.nombreLibro,
                fechaReserva = args.fechaReserva,
                codigoReserva = args.codigoReserva,
                onRenovar = {
                    navController.navigate(RenovarReserva(args.nombreLibro, args.fechaReserva))
                },
                onCancelar = {
                    navController.popBackStack(MisReservas, inclusive = false)
                },
                onVolver = { navController.popBackStack() }
            )
        }

        composable<RenovarReserva> { entry ->
            val args = entry.toRoute<RenovarReserva>()
            RenovarReservaScreen(
                nombreLibro = args.nombreLibro,
                fechaReserva = args.fechaReserva,
                onConfirmar = { fechaNueva: String ->
                    navController.navigate(RenovacionExitosa(args.nombreLibro, fechaNueva))
                },
                onVolver = { navController.popBackStack() }
            )
        }

        composable<RenovacionExitosa> { entry ->
            val args = entry.toRoute<RenovacionExitosa>()
            RenovacionExitosaScreen(
                nombreLibro = args.nombreLibro,
                fechaNueva = args.fechaNueva,
                onVolverReservas = {
                    navController.popBackStack(MisReservas, inclusive = false)
                }
            )
        }
    }
}