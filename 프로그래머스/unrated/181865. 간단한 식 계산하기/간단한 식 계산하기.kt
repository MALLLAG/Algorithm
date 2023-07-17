class Solution {
    fun solution(binomial: String): Int {
        val (a, op, b) = binomial.split(" ")

        return if (op == "+") {
            a.toInt() + b.toInt()
        } else if (op == "-") {
            a.toInt() - b.toInt()
        } else {
            a.toInt() * b.toInt()
        }
    }
}