package com.codility.solutions.topics.fly.counting.elements

class PermCheck {
    fun solution(A: IntArray): Int {
        // variable representing the number of elements in A
        val arraySize: Int = A.size
        A.sort()
        for (i in 0 until arraySize) {
            if (A[i] != i + 1) {
                return 0
            }
        }
        return 1
    }
}