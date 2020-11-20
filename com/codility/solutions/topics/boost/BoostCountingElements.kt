package com.codility.solutions.topics.boost

import com.codility.helper.PrintHelper
import com.codility.solutions.topics.fly.counting.elements.FrogRiverOne
import com.codility.solutions.topics.fly.counting.elements.MaxCounters

class BoostCountingElements {
    fun initiate() {
        runFrogRiverOne()
        runMaxCounters()
    }

    private fun runFrogRiverOne() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runFrogRiverOne()")
        var frogRiverOne = FrogRiverOne()
        var array: IntArray = intArrayOf(1,4,1,4,2,3,5,4)
        PrintHelper.displayIntArray(array)
        PrintHelper.displayInt(frogRiverOne.solution(5,array))
    }

    private fun runMaxCounters() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runMaxCounters()")
        var maxCounters = MaxCounters()
        var array: IntArray = intArrayOf(3,4,4,6,1,4,4)
        PrintHelper.displayIntArrayReturnArray(array, maxCounters.solution(5,array))
    }
}