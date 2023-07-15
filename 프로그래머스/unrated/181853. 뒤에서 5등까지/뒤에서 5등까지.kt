class Solution {
    fun solution(num_list: IntArray): IntArray {
        return num_list.sortedArray()
            .slice(0..4)
            .toIntArray()
    }
}