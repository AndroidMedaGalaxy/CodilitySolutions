package com.codility.helper

class PrintHelper {
    companion object {
        fun displayString(str: String) {
            println(str)
        }

        fun displayIntArrayReturnArray(arrayBefore: IntArray, arrayAfter: IntArray) {
            println(arrayBefore.contentToString() + " : " + arrayAfter.contentToString())
        }

        fun displayIntArray(array: IntArray) {
            println(array.contentToString())
        }

        fun displayInt(int: Int) {
            println(int)
        }

        fun displayFunctionSeparator() {
            println("-------------------------------------------------")
        }
    }

}