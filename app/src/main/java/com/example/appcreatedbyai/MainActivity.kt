package com.example.appcreatedbyai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    var showSplash by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(1000)
        showSplash = false
    }

    if (showSplash) {
        SplashScreen()
    } else {
        HomeScreen()
    }
}

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF119DCF)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "AI Wisdom by AI",
                color = Color.White,
                fontSize = 24.sp
            )
        }
    }
}

@Composable
fun HomeScreen() {
    val sabedorias = listOf(
        "A vida é 10% o que acontece comigo e 90% como eu reajo a isso. Atribuída a: Charles R. Swindoll",
        "O sucesso não é definitivo, o fracasso não é fatal: o que conta é a coragem de continuar. Atribuída a: Winston Churchill",
        "A jornada de mil milhas começa com um único passo. Atribuída a: Lao Tsé",
        "A vida é o que acontece enquanto você está ocupado fazendo outros planos. Atribuída a: John Lennon",
        "A melhor maneira de prever o futuro é criá-lo. Atribuída a: Peter Drucker",
        "O que você faz fala tão alto que não consigo ouvir o que você diz. Atribuída a: Ralph Waldo Emerson",
        "Não é o que fazemos de vez em quando que molda nossas vidas, mas o que fazemos consistentemente. Atribuída a: Tony Robbins",
        "Você não pode mudar o vento, mas pode ajustar as velas para chegar ao seu destino. Atribuída a: Confúcio",
        "A verdadeira sabedoria está em reconhecer a própria ignorância. Atribuída a: Sócrates",
        "Não espere por uma crise para descobrir o que é importante na sua vida. Atribuída a: Platão"
    )
    var mensagem by remember { mutableStateOf("Clique no botão abaixo para adquirir uma nova sabedoria") }
    var isThinking by remember { mutableStateOf(false) }

    val scope = rememberCoroutineScope()

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(
                text = mensagem,
                fontSize = 18.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = android.R.drawable.arrow_down_float),
                contentDescription = null
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {
                    isThinking = true
                    mensagem = "Estou pensando..."
                    scope.launch {
                        delay(1000)
                        isThinking = false
                        mensagem = sabedorias[Random.nextInt(sabedorias.size)]
                    }
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF119DCF))
            ) {
                Text(
                    text = "Nova sabedoria",
                    color = Color.White
                )
            }
        }
    }
}