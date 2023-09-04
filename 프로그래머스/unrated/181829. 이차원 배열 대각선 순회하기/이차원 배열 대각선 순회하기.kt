class Solution {
    fun solution(board: Array<IntArray>, k: Int): Int {
        var result = 0
        
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (i + j <= k) {
                    result += board[i][j]
                }
            }
        }
        
        return result
    }
}