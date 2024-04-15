package com.example.prueba1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prueba1.ui.theme.Prueba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Prueba1Theme {
                val navController = rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(navController, startDestination = "pantalla_principal") {
                        composable("pantalla_principal") {
                            PantallaPrincipal(
                                onNavigateToHonorarios = {
                                    navController.navigate("pantalla_honorarios")
                                },
                                onNavigateToRegular = {
                                    navController.navigate("pantalla_contrato")
                                }
                            )
                        }
                        composable("pantalla_honorarios") {
                            PantallaHonorarios {
                                navController.popBackStack()
                            }
                        }
                        composable("pantalla_contrato") {
                            PantallaContrato {
                                navController.popBackStack()
                            }
                        }
                    }
                }
            }
        }
    }
}
