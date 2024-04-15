package com.example.prueba1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PantallaPrincipal(
    onNavigateToHonorarios: () -> Unit,
    onNavigateToRegular: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { onNavigateToHonorarios() },
            modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
        ) {
            Text(
                text = "Calcular Honorarios",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp
                )
            )
        }
        Button(
            onClick = { onNavigateToRegular() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Calcular Empleados con Contrato",
                style = TextStyle(
                    color = Color.Black,
                    fontSize = 16.sp
                )
            )
        }
    }
}

