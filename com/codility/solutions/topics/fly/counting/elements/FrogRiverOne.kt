package com.codility.solutions.topics.fly.counting.elements

import java.lang.Exception

class FrogRiverOne {
    fun solution(X: Int, A: IntArray): Int {
        // write your code in Kotlin
        var list = HashSet<Int>()
        try {
            for (i in 0..A.size) {
                if (!list.contains(A[i])) {
                    list.add(A[i])
                }
                if (list.size == X) return i
            }
        } catch (e: Exception) {
            return -1
        }
        return -1
    }
}