package com.example.composecalculator

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier
) {
    Box(modifier = Modifier) {
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter),
           verticalArrangement = Arrangement.spacedBy(buttonSpacing)
       ){

           Text(
               text = state.number1 + (state.operations ?: "") + state.number2,
               textAlign =  TextAlign.End,
               modifier = Modifier.fillMaxWidth()
                   .padding(vertical = 32.dp),
               fontWeight = FontWeight.Light,
               fontSize = 50.sp,
               color = Color.White,
               maxLines = 2
           )

           
       }

    }


}