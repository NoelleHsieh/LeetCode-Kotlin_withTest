package com.example.testapplication.array

/*
*
* Best Time to Buy and Sell Stock II
*
* You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
* On each day, you may decide to buy and/or sell the stock. You can only hold
* at most one share of the stock at any time. However, you can buy it then
* immediately sell it on the same day.Find and return the maximum profit you can achieve.
*
* */
class BestTimeToBuyAndSellStockII {

    // Time complexity: O(n)
    // Space complexity: O(1)
    fun solution(array: Array<Int>): Int {
        var sum = 0
        array.forEachIndexed { index, item ->
            if (index + 1 == array.size) return sum
            if (array[index + 1] - item > 0) {
                sum += array[index + 1] - item
            }
        }
        return sum
    }
}
