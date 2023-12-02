package com.paupiette.laba1.hard.tasks

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun ColorChangingCard() {
    var cardColor by remember { mutableStateOf(Color.Blue) }

    fun changeColor() {
        cardColor = if (cardColor == Color.Blue) Color.Red else Color.Blue
    }
    Box(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)) {
        Card(
            onClick = {changeColor()},
            colors = CardDefaults.cardColors(
                containerColor = cardColor
            ),
            modifier = Modifier
                .size(width = 200.dp, height = 200.dp)
        ) {}
    }
}





