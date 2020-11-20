package com.codility.solutions.topics.fly.counting.elements

class MissingInteger {
    fun solution(A: IntArray): Int {
        // variable representing the number of elements in A
        val arraySize: Int = A.size
        val arrayBoolean = BooleanArray(arraySize + 1)
        val arrayBooleanSize = arrayBoolean.size

        for (i in 0 until arraySize) {
            if (A[i] in 1 until arrayBooleanSize) {
                arrayBoolean[A[i]] = true
            }
        }
        for (i in 1 until arrayBooleanSize) {
            if (!arrayBoolean[i]) {
                return i
            }
        }
        return arrayBooleanSize
    }
}