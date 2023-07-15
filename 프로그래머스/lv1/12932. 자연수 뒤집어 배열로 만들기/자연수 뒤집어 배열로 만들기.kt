class Solution {
    fun solution(n: Long): IntArray {
        return n.toString().reversed()
            .chunked(1)
            .map { it.toInt() }
            .toIntArray()
    }
}