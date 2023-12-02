package com.paupiette.laba1.ui.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun ButtonWithText() {
    val context = LocalContext.current
    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
    {
        Button(
            onClick = {
                Toast.makeText(context, "Вы нажали на кнопку", Toast.LENGTH_SHORT).show()
                Log.d("MyButton", "Кнопка нажата")
            },
            contentPadding = PaddingValues(horizontal = 60.dp, vertical = 25.dp)
        )
        {
            Text(text = "Нажать")
        }
    }

}