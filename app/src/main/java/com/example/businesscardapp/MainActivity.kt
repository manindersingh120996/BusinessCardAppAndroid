package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier){
    val img = painterResource(id = R.drawable.android_logo)
    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Gray,),
        ){
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.7f),
        verticalArrangement = Arrangement.Center
            ){
Image(
painter = img,
    contentDescription = "my image",
    modifier = Modifier
        .size(200.dp)
        .padding(top = 30.dp, bottom = 5.dp)
)
        Text(text = "Maninder Singh",
            fontSize = 40.sp,
            color = Color.White,
            modifier = Modifier
                .padding(5.dp))
Text(text="Senior Data Scientist",
    fontWeight = FontWeight.Bold,
    fontSize = 20.sp,
    color = Color.White,
    modifier = Modifier
        .padding(5.dp))

    }


    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .weight(0.3f)) {
        Text(text = "+91-9**14****",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .padding(5.dp))
        Text(text="https://medium.com/@manindersingh120996",
            fontSize = 20.sp,
            color = Color.White,
            textAlign = TextAlign.Center,

            modifier = Modifier
                .padding(5.dp)

        )

        Text(text = "manindersingh120996@gmail.com",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .padding(5.dp))
    }
    }

}

@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCard()
    }
}