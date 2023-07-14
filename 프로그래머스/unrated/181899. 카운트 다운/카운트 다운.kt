class Solution {
    fun solution(start: Int, end: Int): IntArray {
        val result = mutableListOf<Int>()
        for (i in end..start) {
            result.add(i)
        }
        result.reverse()
        return result.toIntArray()
    }
}