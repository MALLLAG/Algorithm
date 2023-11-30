class Solution {
    fun solution(
        arr: IntArray
    ): IntArray {
        val minimum = arr.minOf { it }
        val minimumIndex = arr.indexOf(minimum)
        
        val result = mutableListOf<Int>()
        
        for (i in arr.indices) {
            if (i != minimumIndex) {
                result.add(arr[i])
            }
        }
        
        return if (result.isEmpty()) {
            intArrayOf(-1)
        } else {
            result.toIntArray()
        }
    }
}