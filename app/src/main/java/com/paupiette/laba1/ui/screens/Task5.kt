package com.paupiette.laba1.ui.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun ClickableCard() {

    val context = LocalContext.current
    Box(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
    {
        Card(
            modifier = Modifier.size(width = 200.dp, height = 100.dp),
            onClick = {
                Toast.makeText(context, "Вы нажали на карточку", Toast.LENGTH_SHORT).show()
                Log.d("ClickableCard", "Вы нажали на карточку")
            },
            border = BorderStroke(width = 1.dp, color = Color.Black)
        )
        {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                Text(text = "Нажми на карточку")
            }

        }
    }

}