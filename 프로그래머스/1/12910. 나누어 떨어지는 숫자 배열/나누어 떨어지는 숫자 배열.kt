class Solution {
    fun solution(
        arr: IntArray,
        divisor: Int
    ): IntArray {
        val sortedArr = arr.sorted()
        val results = mutableListOf<Int>()
        
        for (i in sortedArr.indices) {
            if (sortedArr[i] % divisor == 0) {
                results.add(sortedArr[i])
            }
        }
        
        if (results.isEmpty()) {
            results.add(-1)
            return results.toIntArray()
        } else {
            return results.toIntArray()
        }
    }
}