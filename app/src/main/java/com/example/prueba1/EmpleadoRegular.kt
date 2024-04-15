package com.example.prueba1

class EmpleadoRegular(sueldoBruto: Double) : Empleado(sueldoBruto) {
    // Implementación del método calcularLiquido para empleados regulares
    override fun calcularLiquido(): Double {
        // Retención del 20% para empleados regulares
        return sueldoBruto * (1 - 0.20)
    }
}