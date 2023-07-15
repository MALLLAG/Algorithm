class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val result = LongArray(n)
        var current = x.toLong()
        for (i in 0 until n) {
            result[i] = current
            current += x
        }
        return result
    }
}