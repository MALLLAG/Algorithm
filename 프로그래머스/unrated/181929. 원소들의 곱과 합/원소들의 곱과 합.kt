class Solution {
    fun solution(num_list: IntArray): Int {
        val a = num_list.reduce { total, num -> total * num }
        val b = num_list.sum() * num_list.sum()
        
        return if (a < b) {
            1
        } else {
            0
        }
    }
}