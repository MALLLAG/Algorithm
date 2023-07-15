class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var result = ""
        for (i in my_strings.indices) {
            result += my_strings[i].slice(parts[i][0]..parts[i][1])
        }
        return result
    }
}