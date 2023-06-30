class Solution {
    fun solution(num_str: String): Int {
        var sum = 0
        for (i in num_str.indices) {
            sum += num_str[i].toString().toInt()
        }
        return sum
    }
}