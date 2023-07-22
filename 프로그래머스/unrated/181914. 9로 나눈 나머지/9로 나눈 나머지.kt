class Solution {
    fun solution(number: String): Int {
        val sum = number.split("")
            .filter { it.isNotEmpty() }
            .sumOf { it.toInt() }

        return sum % 9
    }
}