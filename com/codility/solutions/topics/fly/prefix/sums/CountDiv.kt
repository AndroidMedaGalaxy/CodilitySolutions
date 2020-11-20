package com.codility.solutions.topics.fly.prefix.sums

import kotlin.math.floor


class CountDiv {
    fun solution(A: Int, B: Int, K: Int): Int {
        // obtaining list from the given IntArray
        val numB = floor((B / K).toDouble()).toInt()
        val numA = floor((A / K).toDouble()).toInt()
        var numDiv = numB - numA
        var plus = 0
        if (A % K == 0) plus = 1
        numDiv += plus

        return numDiv
    }
}