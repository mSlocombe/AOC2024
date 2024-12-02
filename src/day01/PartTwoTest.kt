package day01

import org.testng.annotations.Test
import readInput

class PartTwoTest {

    @Test
    fun countSimilarities() {
        val input = listOf(
            4,3,5,3,9,3
        )
        val count = PartTwo().countSimilarities(3, input)
        assert(count == 3)
    }

    @Test
    fun calculateTestDiff() {
        val input = readInput("day01/test")
        assert(PartTwo().calculate(input) == 31)
    }
}