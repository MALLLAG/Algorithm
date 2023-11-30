class Solution {
    fun solution(
        a: IntArray,
        b: IntArray
    ): Int {
        var result = 0
        
        for (i in a.indices) {
            result += a[i] * b[i]
        }
        
        return result
    }
}