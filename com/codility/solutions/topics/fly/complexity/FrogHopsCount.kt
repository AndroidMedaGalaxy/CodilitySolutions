package com.codility.solutions.topics.fly.complexity

class FrogHopsCount {
    fun solution(X: Int, Y: Int, D: Int): Int {
        if ((Y - X) % D == 0) return (Y - X) / D
        return (Y - X) / D + 1
    }
}
