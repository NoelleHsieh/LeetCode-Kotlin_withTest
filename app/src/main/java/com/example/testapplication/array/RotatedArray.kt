package com.example.testapplication.array

/*
*
* Given an array, rotate the array to the right by k steps, where k is non-negative.
* */

class RotatedArray {
    fun solution(array: IntArray, k: Int): IntArray {
        if (k >= array.size || k == 0 || array.size == 1) return array
        val answerArray = Array(array.size) { 0 }
        var index = 0
        for (i in 1..k) { // 1. Should start with 0
            answerArray[k - i] = array[array.size - i] // 2. Should replace number at k - i
            index++
        }
        for (i in 0 until (array.size - k)) {
            answerArray[index + i] = array[i]
        }
        return answerArray.toIntArray()
    }

    // Copy an array
    // Time Complexity O(2n)
    // Space Complexity O(n)
}