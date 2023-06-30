class Solution {
    fun solution(num_list: IntArray): Int {
        val (even, odd) = num_list.partition { it % 2 == 0 }
        return even.joinToString("").toInt() + odd.joinToString("").toInt()
    }
}