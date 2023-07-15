class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val a = mutableListOf<Int>()
        val b = mutableListOf<Int>()

        num_list.onEachIndexed {
                index, i -> if (index < n) b.add(i) else a.add(i)
        }

        return (a + b).toIntArray()
    }
}