class Solution {
    fun solution(
        s: String,
        n: Int
    ): String {
        return s.map { plus(it, n) }.joinToString("")
    }

    private fun plus(
        c: Char,
        n: Int
    ): Char {
        return when (c) {
            in 'A'..'Z' -> { if (c + n > 'Z') c + n - 26 else c + n }
            in 'a'..'z' -> { if (c + n > 'z') c + n - 26 else c + n }
            else -> { c }
        }
    }
}