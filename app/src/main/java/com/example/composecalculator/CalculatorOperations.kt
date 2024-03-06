package com.example.composecalculator

import java.text.DateFormatSymbols

sealed class CalculatorOperations  (val symbols: String){

    object Add: CalculatorOperations("+")
    object Subtract: CalculatorOperations("-")
    object Multiply: CalculatorOperations("*")
    object Divide: CalculatorOperations("/")

}