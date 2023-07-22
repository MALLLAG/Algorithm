class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        val result = mutableListOf<Int>()
        for (i in intervals.indices) {
            result.addAll(arr.slice(intervals[i][0]..intervals[i][1]))
        }
        return result.toIntArray()
    }
}