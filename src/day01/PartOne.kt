package day01

import kotlin.math.abs

class PartOne {
    fun calculate(input: List<String>): Int {
        val lists = splitList(input)
        return sumDiff(lists)
    }
    fun splitLine(input: String): Pair<Int, Int> {
        val firstDigit = input.takeWhile { it.isDigit() }.toInt()
        val lastDigit = input.takeLastWhile { it.isDigit() }.toInt()
        return Pair(firstDigit, lastDigit)
    }
    fun splitList(input: List<String>): Pair<List<Int>, List<Int>> {
        val firstList = mutableListOf<Int>()
        val secondList = mutableListOf<Int>()
        input.forEach {
            val (firstEntry, secondEntry) = splitLine(it)
            firstList.add(firstEntry)
            secondList.add(secondEntry)
        }
        return Pair(firstList, secondList)
    }
    fun sumDiff(input: Pair<List<Int>, List<Int>>): Int {
        val (firstList, secondList) = input
        val firstSorted = firstList.sorted()
        val secondSorted = secondList.sorted()

        var sum = 0
        firstSorted.forEachIndexed { index, firstDigit ->
            val secondDigit = secondSorted[index]
            sum += abs(firstDigit - secondDigit)
        }

        return sum
    }
}