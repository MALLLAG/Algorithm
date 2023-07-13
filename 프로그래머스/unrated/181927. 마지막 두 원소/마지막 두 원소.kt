class Solution {
    fun solution(num_list: IntArray): IntArray {
        val result = mutableListOf<Int>()
        
        val lastIndex = num_list.lastIndex
        val a = num_list[lastIndex]
        val b = num_list[lastIndex - 1]
        
        result.addAll(num_list.toList())
        
        if (a > b) {
            result.add(a - b)
        } else {
            result.add(a * 2)
        }
        
        return result.toIntArray()
    }
}