class Solution {
    fun solution(a: Int, b: Int): Int {
        val c = (a.toString() + b.toString()).toInt()
        val d = 2 * a * b
        return if (c >= d) {
            c
        } else {
            d
        }
    }
}