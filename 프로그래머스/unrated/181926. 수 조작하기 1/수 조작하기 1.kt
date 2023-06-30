class Solution {
    fun solution(n: Int, control: String): Int {
        var result = n
        control.toCharArray()
            .onEach {
                when (it) {
                    'w' -> result += 1
                    's' -> result -= 1
                    'd' -> result += 10
                    else -> result -= 10
                }
            }
        return result
    }
}