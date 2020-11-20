package com.codility.solutions.topics.fly.iterations

class BinaryGap {


    private fun main(args: Array<String>) {
        var sol: BinaryGap = BinaryGap()
        sol.solution(9)
    }


    fun solution(N: Int): Int {
        var binaryNumber: String
        var tempInitiate = false
        var tempGap = 0
        var largestGap = 0

        // validate if withinrange
        if (isWithinRange(N)) {
            // converting the integer to Binaryt a gone
            binaryNumber = N.toString(2)

            for (x in binaryNumber) {
                if (x == '1') {
                    if (largestGap < tempGap) largestGap = tempGap
                    tempInitiate = true
                    tempGap = 0
                } else if (tempInitiate) {
                    tempGap++
                }
            }
        }
        return largestGap
    }

    private fun toggleInitiate(tempInitiate: Boolean): Boolean {
        return !tempInitiate
    }

    private fun isWithinRange(number: Int): Boolean {
        if (number in 1..2147483647) return true
        return false
    }
}

