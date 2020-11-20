package com.codility.solutions.topics.boost

import com.codility.helper.PrintHelper
import com.codility.solutions.topics.fly.prefix.sums.CountDiv

class BoostPrefixSums {
    fun initiate() {
        runCountDiv()
    }

    private fun runCountDiv() {
        PrintHelper.displayFunctionSeparator()
        PrintHelper.displayString("runCountDiv()")
        var countDiv = CountDiv()
        PrintHelper.displayInt(countDiv.solution(6,11, 2))
        PrintHelper.displayInt(countDiv.solution(11,345, 17))
    }
}