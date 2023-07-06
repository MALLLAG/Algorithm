class Solution {
    fun solution(my_string: String, k: Int): String {
        var result = ""
        for (i in 1 .. k) {
            result = result.plus(my_string)
        }

        return result
    }
}