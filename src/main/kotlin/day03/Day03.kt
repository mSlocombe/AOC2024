package day03

import Day
import org.testng.annotations.Test
import readInput

class Day03 : Day {

    override fun partOne(): String {
        TODO("Not yet implemented")
    }

    override fun partTwo(): String {
        TODO("Not yet implemented")
    }

    @Test
    fun regexComparison() {
        val input = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"
        val regex = Regex("mul\\(\\d{1,3},\\d{1,3}\\)")

        val seq = regex.findAll(input)
        val total = seq.sumOf {
            val (a, b) = it.value.split(",")
            val aDigits = a.filter { it.isDigit() }.toInt()
            val bDigits = b.filter { it.isDigit() }.toInt()
            println("$aDigits * $bDigits = ${aDigits * bDigits}")
            aDigits * bDigits
        }

        println("Total = $total")

        assert(total == 161)
    }

    @Test
    fun partOneCalculation() {
        val input = readInput("main/kotlin/day03/input")
        val valid = input.flatMap {
            findValidInputs(it)
        }
        val digitPairs = valid.map {
            splitDigits(it.value)
        }
        val total = digitPairs.sumOf {
            val (a, b) = it
            multiplyDigits(a, b)
        }
        println(total)
    }

    private fun findValidInputs(input: String): Sequence<MatchResult> {
        val regex = Regex("mul\\(\\d{1,3},\\d{1,3}\\)")
        return regex.findAll(input)
    }

    private fun splitDigits(input: String): Pair<Int, Int> {
        val (a, b) = input.split(",")
        val aDigits = a.filter { it.isDigit() }.toInt()
        val bDigits = b.filter { it.isDigit() }.toInt()
        return Pair(aDigits, bDigits)
    }

    private fun multiplyDigits(a: Int, b: Int): Int {
        return a * b
    }
}