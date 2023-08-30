class Solution {
    fun solution(s: String): String {
        val list = s.split(" ").map { it.toInt() }
        val max = list.maxOrNull()
        val min = list.minOrNull()

        return "$min $max"
    }
}