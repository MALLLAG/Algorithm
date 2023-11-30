class Solution {
    fun solution(
        s: String
    ): String {
        val isOdd = s.length % 2 != 0
        
        return if (isOdd) {
            s.slice((s.length / 2)..(s.length / 2))
        } else {
            s.slice((s.length / 2) - 1..(s.length / 2))
        }
    }
}