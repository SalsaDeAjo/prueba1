package com.example.prueba1

abstract class Empleado(val sueldoBruto: Double) {
    // Método abstracto de calculo del sueldo líquido
    abstract fun calcularLiquido(): Double
}