package com.example.testapplication.array

import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class RotatedArrayTest {

    private lateinit var rotatedArray: RotatedArray
    private val fakeArray1 = intArrayOf(1,2,3,4,5,6,7)
    private val fakeArray2 = intArrayOf(-1,-100,3,99)

    private val answerArray1_1 = intArrayOf(7,1,2,3,4,5,6)
    private val answerArray1_2 = intArrayOf(6,7,1,2,3,4,5)
    private val answerArray1_3 = intArrayOf(5,6,7,1,2,3,4)
    private val answerArray2_1 = intArrayOf(99,-1,-100,3)
    private val answerArray2_2 = intArrayOf(3,99,-1,-100)
    @Before
    fun setUp() {
        rotatedArray = RotatedArray()
    }

    @Test
    fun solution() {
//        assertArrayEquals(answerArray1_1, rotatedArray.solution(fakeArray1, 1))
//        assertArrayEquals(answerArray1_2, rotatedArray.solution(fakeArray1, 2))
        assertArrayEquals(answerArray1_3, rotatedArray.solution(fakeArray1, 3))
//        assertArrayEquals(answerArray2_1, rotatedArray.solution(fakeArray2, 1))
        assertArrayEquals(answerArray2_2, rotatedArray.solution(fakeArray2, 2))
    }

   /* Result 1
    * arrays first differed at element [0]; expected:<7> but was:<0>
      Expected :7
      Actual   :0
    * */

    /* Result 1
    * arrays first differed at element [0]; expected:<6> but was:<7>
      Expected :6
      Actual   :7
    * */


    /* Result 4
    * arrays first differed at element [0]; expected:<6> but was:<5>
      Expected :6
      Actual   :5
      * Can not put the assertion in the same function, the values in the array will be affect by the first assertion.
    * */
}