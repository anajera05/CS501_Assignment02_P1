package com.example.problem1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.problem1.ui.theme.Problem1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Problem1Theme {
                    AssignmentPreview()
            }
        }
    }
}




@Composable
fun ColorCard(color: Color, label: String) {    // Problem 1
    Card(
        colors = CardDefaults.cardColors(
            containerColor = color,
        ),
        modifier = when (label){
            "Red" -> Modifier.background(Color.Red).size(width = 240.dp, height = 100.dp)
            "Blue" -> Modifier.background(Color.LightGray).size(width = 240.dp, height = 100.dp).padding(30.dp)
            "Green" -> Modifier.size(width = 240.dp, height = 240.dp).padding(20.dp)
            else -> Modifier
        }



    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize()
            ,

            contentAlignment = Alignment.Center
        ) {
            Text(
                text = label
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun AssignmentPreview() {
    Problem1Theme {
        Column {
            ColorCard(Color.Red, "Red")
            ColorCard(Color.Blue, "Blue")
            ColorCard(Color.Green, "Green")
        }


    }
}

