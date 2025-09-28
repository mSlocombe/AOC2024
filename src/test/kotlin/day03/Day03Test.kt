package day03

import org.testng.annotations.Test

class Day03Test {

    @Test
    fun regexComparison() {
        val input = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))"
        val regex = Regex("mul\\(\\d{1,3},\\d{1,3}\\)")

        val seq = regex.findAll(input)

        assert(false) {
            seq
        }
    }
}