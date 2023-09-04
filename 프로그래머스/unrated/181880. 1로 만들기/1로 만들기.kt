class Solution {
    fun solution(num_list: IntArray): Int {
        var result = 0
        for (i in num_list.indices) {
            var current = num_list[i]
            
            while (current != 1) {
                if (current % 2 == 0) {
                    current /= 2
                } else {
                    current = (current - 1) / 2
                }
                result++
            }
        }
        
        return result
    }
}