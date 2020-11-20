package com.codility.solutions.topics.boost

import com.codility.helper.PrintHelper
import com.codility.solutions.topics.fly.complexity.FrogHopsCount
import com.codility.solutions.topics.fly.complexity.PermMissingElem
import com.codility.solutions.topics.fly.complexity.TapeEquilibrium

class BoostComplexity {
    fun initiate() {
        runFrogHopsCount()
        runPermMissingElem()
        runTapeEquilibrium()
    }

    private fun runFrogHopsCount() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runFrogHopsCount()")
        var frogHopsCount = FrogHopsCount()
        PrintHelper.displayInt(frogHopsCount.solution(10, 1350, 30))
        PrintHelper.displayInt(frogHopsCount.solution(10, 75, 30))
        PrintHelper.displayInt(frogHopsCount.solution(45, 1350, 25))
    }

    private fun runPermMissingElem() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runPermMissingElem()")
        var permMissingElem = PermMissingElem()
        var array: IntArray = intArrayOf(2, 3, 1, 5)
        PrintHelper.displayIntArray(array)
        PrintHelper.displayInt(permMissingElem.solution(array))
    }

    private fun runTapeEquilibrium() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runTapeEquilibrium()")
        var tapeEquilibrium = TapeEquilibrium()
        var array: IntArray = intArrayOf(3, 1, 2, 4, 3)
        PrintHelper.displayIntArray(array)
        PrintHelper.displayInt(tapeEquilibrium.solution(array))
    }
}