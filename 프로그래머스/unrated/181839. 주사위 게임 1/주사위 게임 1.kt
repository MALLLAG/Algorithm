import kotlin.math.absoluteValue

class Solution {
    fun solution(a: Int, b: Int): Int {
        return if (a % 2 != 0 && b % 2 != 0) {
            a * a + b * b
        } else if (a % 2 == 0 && b % 2 == 0) {
            (a - b).absoluteValue
        } else {
            2 * (a + b)
        }
    }
}