class Solution {
    fun solution(myString: String, pat: String): Int {
        val contains = myString.map {
            if (it == "A"[0]) {
                "B"
            } else {
                "A"
            }
        }.joinToString("")
        .contains(pat)

        return if (contains) {
            1
        } else {
            0
        }
    }
}