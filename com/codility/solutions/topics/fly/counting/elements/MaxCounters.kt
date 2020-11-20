package com.codility.solutions.topics.fly.counting.elements

class MaxCounters {
    fun solution(N: Int, A: IntArray): IntArray {
        val array = IntArray(N)
        var max = 0
        var lastUpdate = 0

        for (i in A.indices) {
            if (A[i] < N + 1) {
                if (array[A[i] - 1] < lastUpdate) {
                    array[A[i] - 1] = lastUpdate + 1
                } else {
                    array[A[i] - 1]++
                }
                max = max.coerceAtLeast(array[A[i] - 1])
            } else if (A[i] == N + 1) {
                lastUpdate = max
            }
        }

        for (i in 0 until N) {
            if (array[i] < lastUpdate) {
                array[i] = lastUpdate
            }
        }
        return array
    }
}