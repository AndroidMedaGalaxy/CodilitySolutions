package com.codility.solutions.topics.fly.complexity

import kotlin.math.abs

class TapeEquilibrium {
    fun solution(A: IntArray): Int {
        val number: Int = A.size
        var minDiff = Int.MAX_VALUE

        var sum1 = A[0]
        var sum2 = 0
        for (i in 1 until number) sum2 += A[i]

        for (i in 1 until number) {
            minDiff = abs(sum1 - sum2).coerceAtMost(minDiff)
            sum1 += A[i]
            sum2 -= A[i]
        }
        return minDiff
    }
}