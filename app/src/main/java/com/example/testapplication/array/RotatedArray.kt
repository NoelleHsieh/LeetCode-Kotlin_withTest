package com.example.testapplication.array

/*
*
* Given an array, rotate the array to the right by k steps, where k is non-negative.
* */

class RotatedArray {

    // find out that we should return Unit...
    // Misunderstood the k steps usage....
    fun solution(array: IntArray, k: Int): IntArray {
        if (k == 0 || array.size == 1 || array.size == k) return array
        var divider = if(array.size > k) k else (k % array.size)
        val tailArray = Array(array.size - divider) { 0 }
        for (i in 0 until tailArray.size) {
            tailArray[i] = array[i]
        }
        println()
        for (i in 0 until divider) {
            array[i] = array[tailArray.size + i]
        }
        for (i in 0 until tailArray.size) {
            array[i + divider] = tailArray[i]
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