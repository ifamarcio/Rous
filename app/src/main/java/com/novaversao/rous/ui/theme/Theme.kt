package com.novaversao.rous.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.Typography
import androidx.compose.material3.Shapes
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

// Definição das cores
val Purple80 = Color(0xFF7A4D96)  // Definindo a cor Purple80
val Purple40 = Color(0xFF9A4E97)  // Exemplo de outra cor Purple
val Pink80 = Color(0xFFF7A1C4)  // Definindo outra cor
val Pink40 = Color(0xFFF3B8C1)  // Exemplo de outra cor Pink

// Definindo a paleta de cores do tema
private val LightColors = lightColorScheme(
    primary = Purple80,
    secondary = Pink80,
    // Defina as outras cores conforme necessário
)

private val DarkColors = darkColorScheme(
    primary = Purple40,
    secondary = Pink40,
    // Defina as outras cores conforme necessário
)

// Definindo o Shapes
private val Shapes = Shapes(
    small = androidx.compose.material3.Shapes().small,
    medium = androidx.compose.material3.Shapes().medium,
    large = androidx.compose.material3.Shapes().large
)

@Composable
fun RousTheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColors
    } else {
        LightColors
    }

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        shapes = Shapes,  // Agora Shapes está corretamente configurado
        content = content
    )
}
