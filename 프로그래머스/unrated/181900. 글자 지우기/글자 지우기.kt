class Solution {
    fun solution(
        my_string: String,
        indices: IntArray
    ): String {
        val temp = my_string.split("")
            .filter { it.isNotEmpty() }
            .toMutableList()

        for (indice in indices) {
            temp[indice] = ""
        }

        return temp.joinToString("")
    }
}