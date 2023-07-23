class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        return intStrs.map { it.substring(s until s+l) }
            .filter { it.toInt() > k }
            .map { it.toInt() }
            .toIntArray()
    }
}