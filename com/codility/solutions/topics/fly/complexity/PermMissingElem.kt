package com.codility.solutions.topics.fly.complexity

class PermMissingElem {
    fun solution(A: IntArray): Int {
        // write your code in Kotlin

        var expectedInt = 1
        var missedInt = 0

        A.sort()

        if(A.isNotEmpty())
        {
            for (x in A) {
                if (x == expectedInt) { //if found a value based on expected value
                    expectedInt++
                } else { //if found a missing value
                    missedInt = expectedInt
                }
            }
        }
        else missedInt = 1

        if (missedInt == 0){ //if no missing value, just set to the last value + 1
            missedInt = A[A.size - 1] + 1;
        }
        return missedInt
    }
}