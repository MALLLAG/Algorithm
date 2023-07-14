class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var result = 0
        for (i in numbers.indices) {
            if (result <= n) {
                result += numbers[i]    
            }
        }
        return result
    }
}