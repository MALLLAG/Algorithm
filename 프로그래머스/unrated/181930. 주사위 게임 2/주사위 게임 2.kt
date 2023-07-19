class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        return if (a == b && b == c) {
            (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c)
        } else if (a != b && b != c && a != c) {
            a + b + c
        } else {
            (a + b + c) * (a * a + b * b + c * c)
        }
    }
}