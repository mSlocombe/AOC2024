package day01

import org.testng.annotations.Test
import readInput

class DayOneTest {

    @Test
    fun splitLineDescriptionTest() {
        val input = "3   4"
        val theSplit = PartOne().splitLine(input)
        assert(theSplit == Pair(3, 4))
    }

    @Test
    fun splitLine() {
        val input = "64430   75582"
        val theSplit = PartOne().splitLine(input)
        assert(theSplit == Pair(64430, 75582))
    }

    @Test
    fun splitList() {
        val input = readInput("day01/test")
        val split = PartOne().splitList(input)
        assert(
            split == Pair(
                listOf(3, 4, 2, 1, 3, 3),
                listOf(4, 3, 5, 3, 9, 3)
            )
        )
    }

    @Test
    fun sumLists() {
        val input = Pair(
            listOf(3, 4, 2, 1, 3, 3),
            listOf(4, 3, 5, 3, 9, 3)
        )

        val difference = PartOne().sumDiff(input)
        assert(difference == 11)
    }
}