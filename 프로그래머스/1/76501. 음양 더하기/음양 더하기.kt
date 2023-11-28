class Solution {
    fun solution(
        absolutes: IntArray,
        signs: BooleanArray
    ): Int {
        var result = 0
        
        for (i in signs.indices) {
            var number = 0
            val isPlus = signs[i]
            
            if (isPlus) {
                number += absolutes[i]
            } else {
                number -= absolutes[i]
            }
            
            result += number
        }
        
        return result
    }
}