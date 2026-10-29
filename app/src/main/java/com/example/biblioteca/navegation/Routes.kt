package com.example.biblioteca.navegation

import kotlinx.serialization.Serializable

@Serializable
data object Inicio

@Serializable
data object ListaLibros

@Serializable
data class DetalleLibro(val nombreLibro: String)

@Serializable
data class Confirmacion(val nombreLibro: String, val fecha: String)


@Serializable
data object MisReservas

@Serializable
data class DetalleReserva(
    val nombreLibro: String,
    val fechaReserva: String,
    val codigoReserva: String
)

@Serializable
data class RenovarReserva(val nombreLibro: String, val fechaReserva: String)

@Serializable
data class RenovacionExitosa(val nombreLibro: String, val fechaNueva: String)