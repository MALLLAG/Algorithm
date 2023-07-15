class Solution {
    fun solution(num_list: IntArray): Int {
        var a = 0
        var b = 0
        num_list.onEachIndexed {
            index, i -> if (index % 2 == 0) a += i else b += i
        }
        
        return if (a > b) {
            a
        } else {
            b
        }
    }
}