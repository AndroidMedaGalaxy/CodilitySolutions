package com.codility.solutions.topics.fly.arrays
import java.util.Collections
class ArrayRotation {

    fun solution(A: IntArray, K: Int): IntArray {
        // obtaining list from the given IntArray
        var list = A.toList()
        Collections.rotate(list,K)   //rotate list on right by K

        /*NOTE: Can also use the following logic to allow more parameters and complexity in algorithm
        repeat(K){
             //Collections.rotate(list,1)    // 1 represents the number of rotations to do in one pass
        } */
        return list.toIntArray()
    }

}