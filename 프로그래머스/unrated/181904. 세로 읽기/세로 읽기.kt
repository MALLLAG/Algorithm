class Solution {
    fun solution(
        my_string: String,
        m: Int,
        c: Int
    ): String {
        var result = ""

        for (i in 0 until (my_string.length / m)) {
            val left = i * m
            val right = (i + 1) * m
            val slicedString = my_string.slice(left until right)
            result += slicedString[c - 1]
        }

        return result
    }
}