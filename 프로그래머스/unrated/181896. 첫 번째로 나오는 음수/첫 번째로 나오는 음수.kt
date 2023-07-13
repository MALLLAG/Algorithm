class Solution {
    fun solution(num_list: IntArray): Int {
        var result = -1
        for (i in num_list.indices) {
            if (num_list[i] < 0) {
                result = i
                return result
            }
        }
        return result
    }
}