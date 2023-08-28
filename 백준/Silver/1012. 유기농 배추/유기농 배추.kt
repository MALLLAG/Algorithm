import java.util.*

private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val (m, n, k) = readln().split(" ").map { it.toInt() }
        val grid = Array(n) { IntArray(m) {0} }
        val visited = Array(n) { BooleanArray(m) {false} }
        var count = 0

        for (i in 0 until k) {
            val (a, b) = readln().split(" ").map { it.toInt() }
            grid[b][a] = 1
        }

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (grid[i][j] == 0 || visited[i][j]) {
                    continue
                }

                count++

                val queue: Queue<Pair<Int, Int>> = LinkedList()
                queue.offer(Pair(i, j))
                visited[i][j] = true

                while (queue.isNotEmpty()) {
                    val current = queue.poll()

                    for (k in 0..3) {
                        val nx = current.first + dx[k]
                        val ny = current.second + dy[k]

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                            continue
                        }

                        if (visited[nx][ny] || grid[nx][ny] == 0) {
                            continue
                        }

                        queue.offer(Pair(nx, ny))
                        visited[nx][ny] = true
                    }
                }
            }
        }

        println(count)
    }
}