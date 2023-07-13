class Solution {
    fun solution(n: Int, k: Int): IntArray {
        val result = mutableListOf<Int>()
        for (i in 1..n) {
            if (i % k == 0) {
                result.add(i)
            }
        }
        return result.toIntArray()
    }
}