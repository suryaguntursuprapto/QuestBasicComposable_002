package com.example.pam_pertemuan3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_pertemuan3.ui.theme.PAM_Pertemuan3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAM_Pertemuan3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   BasicCompose(
                       guntur = Modifier.padding(innerPadding)
                   )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BasicCompose(guntur: Modifier = Modifier){
    Column (verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Indonesia", modifier = guntur
            , fontSize = 70.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Versus",
            style = TextStyle(
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Green,
                fontFamily = FontFamily.SansSerif
            )
        )
        Image(
            painter = painterResource(id = R.drawable.fifa),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
        )
        Text(text = "Surya Guntur Suprapto",
            modifier = guntur,
            color = Color.Red,
            fontSize = 20.sp,
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAM_Pertemuan3Theme {
        Greeting("Android")
    }
}