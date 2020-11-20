package com.codility.solutions.topics.boost

import com.codility.helper.PrintHelper
import com.codility.solutions.topics.fly.arrays.ArrayRotation
import com.codility.solutions.topics.fly.arrays.OddOccurrenceInArray

class BoostArray {
    fun initiate() {
        runArrayRotation()
        runOddOccurrenceInArray()
    }

    private fun runArrayRotation() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runArrayRotation()")
        var arrayRotation = ArrayRotation()
        var array: IntArray = intArrayOf(10, 20, 30, 40, 50)
        PrintHelper.displayIntArrayReturnArray(array, arrayRotation.solution(array, 2))
    }

    private fun runOddOccurrenceInArray() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runOddOccurrenceInArray()")
        var oddOccurrenceInArray = OddOccurrenceInArray()
        var array: IntArray = intArrayOf(9, 3, 9, 3, 9, 7, 9)
        PrintHelper.displayIntArray(array)
        PrintHelper.displayInt(oddOccurrenceInArray.solution(array))
    }
}