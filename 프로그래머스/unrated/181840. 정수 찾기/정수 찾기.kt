class Solution {
    fun solution(num_list: IntArray, n: Int): Int {
        return if (num_list.filter {it == n}.size > 0) {
            1
        } else {
            0
        }
    }
}