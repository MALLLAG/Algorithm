class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        // 1 2, 3 4, 5 6, 7 8, 9 0, 11 12
        // 3 4 -> 2 // 7 8 -> 4
        
        // 1 2, 3 4 
        // 1 2 -> 1 // 3 4 -> 2
        
        // 1 2
        
        var result = 0
        var na = a
        var nb = b
        
        while (na != nb) {
            na = (na + 1) / 2
            nb = (nb + 1) / 2
            result++
        }
        
        return result
    }
}