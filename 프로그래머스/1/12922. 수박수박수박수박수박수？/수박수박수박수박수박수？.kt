class Solution {
    fun solution(
        n: Int
    ): String {
        var result = ""
        
        for (i in 0 until n) {
            if (isOdd(i)) {
                result += "박"
            } else {
                result += "수"
            }
        }
        
        return result
    }
    
    private fun isOdd(
        index: Int
    ): Boolean = (index % 2 != 0)
}