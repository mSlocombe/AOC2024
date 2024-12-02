package day01

import println
import readInput

fun main() {
    fun part1(input: List<String>): Int {
        return PartOne().calculate(input)
    }

    fun part2(input: List<String>): Int {
        return PartTwo().calculate(input)
    }

    // Or read a large test input from the `src/Day01_test.txt` file:
    val testInput = readInput("day01/test")
    check(part1(testInput) == 11)

    // Read the input from the `src/Day01.txt` file.
    val input = readInput("day01/real")
    part1(input).println()
    part2(input).println()
}
