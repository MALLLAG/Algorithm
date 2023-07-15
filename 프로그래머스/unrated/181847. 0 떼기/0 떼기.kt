class Solution {
    fun solution(n_str: String): String {
        var result = n_str
        while (result.startsWith("0")) {
            result = result.substring(1)
        }
        return result
    }
}