class Solution {
    fun solution(
        n: Int
    ): Int {
        // 0, 1, 1, 2, 3, 5, 8, 13 ...
        
        val numbers = IntArray(n + 1) { 0 }
        numbers[0] = 0
        numbers[1] = 1
        numbers[2] = 1
        
        (3..n).forEach { numbers[it] = (numbers[it - 1] + numbers[it - 2]) % 1234567 }
        
        return numbers[n]
    }
}