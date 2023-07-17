class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        for ((index, value) in arr.withIndex()) {
            if (index >= idx && value == 1) {
                return index
            }
        }
        return -1
    }
}