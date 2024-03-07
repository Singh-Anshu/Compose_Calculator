package com.example.composecalculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {

    var state by mutableStateOf(CalculatorState())
    private set

    fun onAction(action: CalculatorAction){

        when(action){

            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Decimal -> enterDecimal()
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Operations -> enterOperation(action.operations)
            is CalculatorAction.Calculate -> performCalcualtion()
            is CalculatorAction.Delete -> performDeletion()

        }
    }

    private fun performDeletion() {
        TODO("Not yet implemented")
    }

    private fun performCalcualtion() {
        TODO("Not yet implemented")
    }

    private fun enterOperation(operations: CalculatorOperations) {
        TODO("Not yet implemented")
    }

    private fun enterDecimal() {
        TODO("Not yet implemented")
    }

    private fun enterNumber(number: Int) {
        TODO("Not yet implemented")
    }
}