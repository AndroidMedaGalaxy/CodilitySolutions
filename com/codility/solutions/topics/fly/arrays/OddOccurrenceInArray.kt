package com.codility.solutions.topics.fly.arrays


class OddOccurrenceInArray {
    fun solution(A: IntArray): Int {
        var array = A
        array.sort()
        for (i in 0..A.size step 2) {
            if (i + 1 == A.size) return A[i]
            if (A[i] != A[i + 1]) return A[i]
        }
        return 0
    }
}