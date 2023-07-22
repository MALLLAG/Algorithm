class Solution {
    fun solution(a: Int, b: Int): Long {
        var result = 0L
        val start = if (a < b) a else b
        val end = if (a > b) a else b
        
        (start..end).forEach {
            i -> result += i
        }
        
        return result
    }
}