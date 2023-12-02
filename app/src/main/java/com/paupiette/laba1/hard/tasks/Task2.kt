package com.paupiette.laba1.hard.tasks

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun CustomSwitch() {

    val checked = remember { mutableStateOf(true) }
    Box(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center)) {
        Column {
            Switch(
                checked = checked.value,
                onCheckedChange = { checked.value = it }
            )
            if (checked.value) {
                Text("Включено")
            } else {
                Text("Выключено")
            }
        }
    }

}