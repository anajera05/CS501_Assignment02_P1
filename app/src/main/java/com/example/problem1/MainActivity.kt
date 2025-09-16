package com.example.problem1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
        modifier = Modifier     // modifier combination 1
            .size(width = 240.dp, height = 100.dp)
            .padding(10.dp)

    ) {
        Box(    // Box used to center the text
            modifier = Modifier     // modifier combination 2
                .padding(10.dp)
                .fillMaxSize()
                .border(1.dp, Color.Black)
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

