import java.util.*

class Solution {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var result = 0
        val stack = Stack<Int>()
        val n = board[0].size
        
        for (i in moves.indices) {
            for (j in 0 until n) {
                val a = board[j][moves[i] - 1]
                if (a != 0) {
                    board[j][moves[i] - 1] = 0

                    if (stack.isNotEmpty() && stack.peek() == a) {
                        stack.pop()
                        result += 2
                    } else {
                        stack.push(a)
                    }

                    break
                }
            }
        }
        return result
    }
}