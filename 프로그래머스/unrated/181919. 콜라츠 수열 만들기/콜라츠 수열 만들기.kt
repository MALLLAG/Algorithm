class Solution {
    fun solution(n: Int): IntArray {
        var a = n
        val result = mutableListOf<Int>()
        while (a > 1) {
            result.add(a)
            if (a % 2 == 0) {
                a = a / 2
            } else {
                a = 3 * a + 1
            }
        }
        result.add(1)
        return result.toIntArray()
    }
}