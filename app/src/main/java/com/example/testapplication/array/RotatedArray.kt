package com.example.testapplication.array

/*
*
* Given an array, rotate the array to the right by k steps, where k is non-negative.
* */

class RotatedArray {

    // find out that we should return Unit...
    fun solution(array: IntArray, k: Int): IntArray {
        if (k >= array.size || k == 0 || array.size == 1) return array
        val tailArray = Array(array.size - k) { 0 }
        var tailIndex = array.size - k
        for (i in 0 until tailIndex) {
            tailArray[i] = array[i]
            print(tailArray[i])
        }
        for (i in array.indices) {
            if (i < k) {
                array[i] = array[tailIndex]
                tailIndex++
            } else {
                array[i] = tailArray[i - k]
            }
        }
        return array
    }

    // Copy an array
    // Time Complexity O(2n)
    // Space Complexity O(n)

    /*
    Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
    Could you do it in-place with O(1) extra space?
    */
}