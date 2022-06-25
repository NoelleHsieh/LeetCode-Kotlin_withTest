package com.example.testapplication.array

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class BestTimeToBuyAndSellStockIITest {

    private lateinit var method: BestTimeToBuyAndSellStockII
    private val fakeArray1 = arrayOf(7,1,5,3,6,4)
    private val fakeArray2 = arrayOf(1,2,3,4,5)
    private val fakeArray3 = arrayOf(7,6,4,3,1)



    @Before
    fun setUp() {
        method = BestTimeToBuyAndSellStockII()
    }

    @Test
    fun solution() {
        assertEquals(method.solution(fakeArray1), 7)
        assertEquals(method.solution(fakeArray2), 4)
        assertEquals(method.solution(fakeArray3), 0)
    }
}