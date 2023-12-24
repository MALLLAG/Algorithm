class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        // 1 3 2 5 4 5 2 3    -2
        // 1 2 2 3 3 4 5 5
        
        // 1 3 2 5 4 5 2 3    -4
        // 1 2 2 3 3 4 5 5
        
        // 1 1 1 1 2 2 2 3    -6
        // 1 1 1 1 2 2 2 3
        
        val count = Array(10000001) { 0 }
        
        tangerine.forEach { count[it]++ }
        
        count.sortDescending()
        
        var temp = k
        var result = 0
        
        for (i in count.indices) {
            if (temp == 0) {
                break
            }
            
            val quantity = count[i]
            
            if (quantity <= temp) {
                result++
                temp -= quantity
            } else {
                result++
                break
            }
        }
        
        
        return result
    }
}