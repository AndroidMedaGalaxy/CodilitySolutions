package com.codility.solutions.topics.fly.arrays


class OddOccurrenceInArray {
    fun solution(A: IntArray): Int {
        var array = A
        array.sort()  //sorting the array. Ideally we will have pair for each number
        for (i in 0..A.size step 2) { //increasing the counter by 2 assuming we have pair of each number
            if (i + 1 == A.size) return A[i]  //check if the paired number (next indexed number) is not the size of the IntArray
            if (A[i] != A[i + 1]) return A[i] //Check if the current number is paired with same number, if not, that's our candidate
        }
        return 0 //return 0 if yielded no OddOccurrence number
    }
}