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