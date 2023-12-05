class Solution {
    fun solution(
        numbers: IntArray
    ): IntArray {
        val result = mutableSetOf<Int>()
        
        for (i in 0 until numbers.size) {
            for (j in i + 1 until numbers.size) {
                val sum = numbers[i] + numbers[j]
                result.add(sum)
            }
        }
        
        return result.sorted().toIntArray()
    }
}