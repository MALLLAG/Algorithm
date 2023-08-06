class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var result = 0
        for (p in i..j) {
            var tmp = p
            while (tmp > 0) {
                if (tmp % 10 == k) result++
                tmp /= 10
            }
        }
        return result
    }
}