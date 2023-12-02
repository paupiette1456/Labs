package com.paupiette.laba1.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun RedCards() {
    Box(
        modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            RedCard()
            RedCard()
            RedCard()
            RedCard()
            RedCard()
        }
    }
}

@Composable
fun RedCard() {
    Card(
        modifier = Modifier.size(width = 70.dp, height = 70.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Red)
    ) {}
}