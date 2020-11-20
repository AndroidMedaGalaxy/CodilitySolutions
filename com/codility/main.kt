package com.codility

import com.codility.helper.PrintHelper
import com.codility.solutions.topics.boost.BoostArray
import com.codility.solutions.topics.boost.BoostComplexity
import com.codility.solutions.topics.boost.BoostCountingElements
import com.codility.solutions.topics.boost.BoostIterations

fun main(args: Array<String>) {
    initiate()
    PrintHelper.displayFunctionSeparator()
}

fun initiate() {

    var boostIterations = BoostIterations()
    boostIterations.initiate()

    var boostArray = BoostArray()
    boostArray.initiate()

    var boostComplexity = BoostComplexity()
    boostComplexity.initiate()

    var boostCountingElements = BoostCountingElements()
    boostCountingElements.initiate()


}





