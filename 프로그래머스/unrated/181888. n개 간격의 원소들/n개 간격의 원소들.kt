class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return num_list.filterIndexed { index, _ -> index % n == 0 }.toIntArray()
    }
}