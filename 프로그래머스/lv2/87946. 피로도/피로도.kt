class Solution {
    var visited = arrayOf<Boolean>()
    var max = 0

    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visited = Array(dungeons.size) { false }

        dfs(0, dungeons, k)

        return max
    }

    fun dfs(index: Int, dungeons: Array<IntArray>, result: Int) {
        if (index == dungeons.size) {
            max = maxOf(max, index)
            return
        }

        for (i in 0 until dungeons.size) {
            if (visited[i]) {
                continue
            }

            val (a, b) = dungeons[i]

            if (a > result) {
                max = maxOf(max, index)
                continue
            }

            visited[i] = true
            dfs(index + 1, dungeons, result - b)
            visited[i] = false
        }
    }
}