class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sortedArray()
            .slice(5..num_list.lastIndex)
            .toIntArray()
    }
}