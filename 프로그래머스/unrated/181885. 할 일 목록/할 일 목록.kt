class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        val result = mutableListOf<String>()
        
        for (i in todo_list.indices) {
            if (!finished[i]) {
                result.add(todo_list[i])
            }
        }
        
        return result.toTypedArray()
    }
}