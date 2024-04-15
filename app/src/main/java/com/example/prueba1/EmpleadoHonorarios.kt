package com.example.prueba1

class EmpleadoHonorarios(sueldoBruto: Double) : Empleado(sueldoBruto) {
    // Implementación del método calcularLiquido para empleados a honorarios
    override fun calcularLiquido(): Double {
        // Retención del 13% para empleados a honorarios
        return sueldoBruto * (1 - 0.13)
    }
}