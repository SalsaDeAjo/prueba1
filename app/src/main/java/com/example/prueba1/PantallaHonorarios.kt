package com.example.prueba1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableDoubleStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PantallaHonorarios(onBackPressed: () -> Unit) {
    var sueldoBruto by remember { mutableDoubleStateOf(0.0) }
    var sueldoLiquido by remember {  mutableDoubleStateOf(0.0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = sueldoBruto.toString(),
            onValueChange = { sueldoBruto = it.toDoubleOrNull() ?: 0.0 },
            label = { Text(text = "Sueldo Bruto") },
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        )
        Button(
            onClick = {
                sueldoLiquido = sueldoBruto * (1 - 0.13) // Retención del 13%
            },
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        ) {
            Text(text = "Calcular Sueldo Líquido")
        }
        Text(text = "Sueldo Líquido: $sueldoLiquido", modifier = Modifier.fillMaxWidth())
        Button(
            onClick = { onBackPressed() },
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            Text(text = "Volver")
        }
    }
}
