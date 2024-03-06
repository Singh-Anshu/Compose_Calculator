package com.example.composecalculator

import com.example.composecalculator.CalculatorOperations

data class CalculatorState(

    val number1: String = "",
    val number2: String = "",
    val operations : CalculatorOperations? = null
    )