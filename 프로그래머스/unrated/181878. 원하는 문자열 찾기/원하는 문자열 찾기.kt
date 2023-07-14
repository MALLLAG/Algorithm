class Solution {
    fun solution(myString: String, pat: String): Int {
        val contains = myString.lowercase()
            .contains(pat.lowercase())
            
        return if (contains) {
            1
        } else {
            0
        }
    }
}