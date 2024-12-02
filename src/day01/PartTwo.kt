package day01

class PartTwo {
    fun calculate(input: List<String>): Int {
        val (first, second) = splitList(input)
        return first.sumOf {
            it * countSimilarities(it, second)
        }
    }

    private fun splitList(input: List<String>): Pair<List<Int>, List<Int>> {
        return PartOne().splitList(input)
    }

    fun countSimilarities(num: Int, input: List<Int>): Int {
        return input.count { it == num }
    }
}