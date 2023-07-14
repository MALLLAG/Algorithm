class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        var result = ""

        index_list.onEach { result += my_string[it] }
        
        return result
    }
}