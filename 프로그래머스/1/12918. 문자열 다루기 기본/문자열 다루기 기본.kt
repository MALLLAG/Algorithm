class Solution {
    fun solution(s: String): Boolean {
        var result = true
        
        if (s.length != 4 && s.length != 6) {
            result = false
        }
        
        s.toCharArray().forEach { if(!it.isDigit()) result = false }
        
        return result
    }
}