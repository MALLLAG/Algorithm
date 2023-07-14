class Solution {
    fun solution(arr: IntArray): IntArray {
        val result = mutableListOf<Int>()
        for (i in arr.indices) {
            for (j in 1..arr[i]) {
                result.add(arr[i])
            }
        }
        return result.toIntArray()
    }
}