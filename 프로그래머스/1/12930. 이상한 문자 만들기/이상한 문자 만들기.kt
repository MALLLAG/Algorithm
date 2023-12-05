class Solution {
    fun solution(
        s: String
    ): String {
        return s.split(" ")
            .map {
                it.mapIndexed { index, char ->
                    if (index % 2 == 0) {
                        char.uppercase()
                    } else {
                        char.lowercase()
                    }
                }.joinToString("")
            }.joinToString(" ")
    }
}