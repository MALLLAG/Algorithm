class Solution {
    fun solution(start: Int, end: Int): IntArray {
        val result = ArrayList<Int>()
        for (i in start .. end) {
            result.add(i)
        }
        return result.toIntArray()
    }
}