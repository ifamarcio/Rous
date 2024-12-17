// MainActivity.kt
package com.novaversao.rous

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.novaversao.rous.screens.CadastroScreen
import com.novaversao.rous.screens.RegisterScreen
import com.novaversao.rous.screens.UserScreen
import com.novaversao.rous.ui.theme.RousTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RousTheme {
                // Cria o NavController
                val navController = rememberNavController()

                // Configura o NavHost para gerenciar as telas
                NavHost(navController = navController, startDestination = "cadastro") {
                    composable("cadastro") {
                        CadastroScreen(navController)
                    }
                    composable("register") {
                        RegisterScreen(navController)
                    }
                    composable("user") {
                        UserScreen(navController)
                    }
                }
            }
        }
    }
}
