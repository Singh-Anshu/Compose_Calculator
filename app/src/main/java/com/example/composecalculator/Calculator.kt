package com.example.composecalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composecalculator.ui.theme.LightGray
import com.example.composecalculator.ui.theme.MediumGray
import com.example.composecalculator.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorAction) -> Unit
) {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.DarkGray)
        .padding(16.dp)) {
       Column(
           modifier = Modifier
               .fillMaxWidth()
               .align(Alignment.BottomCenter),
           verticalArrangement = Arrangement.spacedBy(buttonSpacing)
       ){

           Text(
               text = state.number1 + (state.operations?.symbols ?: "") + state.number2,
               textAlign =  TextAlign.End,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(vertical = 32.dp),
               fontWeight = FontWeight.Light,
               fontSize = 50.sp,
               color = Color.White,
               maxLines = 2
           )

           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(buttonSpacing)

           ) {

               CalculatorButton(symbol = "AC",
                   modifier = Modifier
                       .aspectRatio(2f)
                       .weight(2f),
                   onclick = {
                       onAction(CalculatorAction.Clear)
                   },
                   color = LightGray,
               )

               CalculatorButton(symbol = "Del",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Delete)
                   },
                   color = LightGray
               )

               CalculatorButton(symbol = "/",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Operations(CalculatorOperations.Divide))
                   },
                   color = Orange
               )

           }

           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(buttonSpacing)

           ) {

               CalculatorButton(symbol = "7",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(7))
                   },
                   color = MediumGray,
                   )

               CalculatorButton(symbol = "8",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(8))
                   },color = MediumGray

               )

               CalculatorButton(symbol = "9",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(9))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "x",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Operations(CalculatorOperations.Multiply))
                   },
                   color = Orange
               )

           }

           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(buttonSpacing)

           ) {

               CalculatorButton(symbol = "4",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(4))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "5",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(5))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "6",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(6))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "-",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Operations(CalculatorOperations.Subtract))
                   },
                   color = Orange
               )

           }

           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(buttonSpacing)

           ) {

               CalculatorButton(symbol = "1",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(1))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "2",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(2))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "3",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Number(3))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "+",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Operations(CalculatorOperations.Add))
                   },
                   color = Orange
               )

           }

           Row(
               modifier = Modifier.fillMaxWidth(),
               horizontalArrangement = Arrangement.spacedBy(buttonSpacing)

           ) {

               CalculatorButton(symbol = "0",
                   modifier = Modifier
                       .aspectRatio(2f)
                       .weight(2f),
                   onclick = {
                       onAction(CalculatorAction.Number(0))
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = ".",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Decimal)
                   },
                   color = MediumGray
               )

               CalculatorButton(symbol = "=",
                   modifier = Modifier
                       .aspectRatio(1f)
                       .weight(1f),
                   onclick = {
                       onAction(CalculatorAction.Calculate)
                   },
                   color = Orange
               )

           }
           
       }

    }


}