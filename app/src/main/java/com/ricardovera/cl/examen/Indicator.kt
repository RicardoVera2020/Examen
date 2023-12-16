package com.ricardovera.cl.examen


data class Indicator(val fecha: String,
                     val valor: Double)




data class titular(
    val version: String,
    val autor: String,
    val codigo: String,
    val nombre: String,
    val unidad_medida: String,
    val serie: List<Indicator>
)
