package com.codility

import com.codility.helper.PrintHelper
import com.codility.solutions.topics.boost.*

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

    var boostPrefixSums = BoostPrefixSums()
    boostPrefixSums.initiate()


}





