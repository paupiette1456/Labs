package com.paupiette.laba1.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun GreenCards() {

    val modifier = Modifier
    Box(
        modifier = modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center))
    {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            GreenCard()
            GreenCard()
            GreenCard()
            GreenCard()
            GreenCard()
        }
    }
}

@Composable
fun GreenCard() {
    Card(
        modifier = Modifier.size(width = 70.dp, height = 70.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Green)
    ) {}
}
