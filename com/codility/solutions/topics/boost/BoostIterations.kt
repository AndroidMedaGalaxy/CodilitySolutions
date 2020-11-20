package com.codility.solutions.topics.boost

import com.codility.helper.PrintHelper
import com.codility.solutions.topics.fly.iterations.BinaryGap

class BoostIterations {
    fun initiate() {
        runBinaryGap()
    }

    private fun runBinaryGap() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runBinaryGap()")
        val sol = BinaryGap()
        PrintHelper.displayString(sol.solution(9).toString())
        PrintHelper.displayString(sol.solution(20).toString())
        PrintHelper.displayString(sol.solution(51712).toString())
        PrintHelper.displayString(sol.solution(74901729).toString())
    }
}