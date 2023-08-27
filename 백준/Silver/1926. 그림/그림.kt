import java.util.*

private var grid = arrayOf<IntArray>()
private var visited = arrayOf<BooleanArray>()
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var count = 0
private var max = 0

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    grid = Array(n) { IntArray(m) }
    visited = Array(n) { BooleanArray(m) }

    for (i in 0 until n) {
        grid[i] = readln().split(" ").map { it.toInt() }.toIntArray()
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
            var area = 0

            while (queue.isNotEmpty()) {
                val current = queue.poll()
                area++

                for (k in 0..3) {
                    val nx = current.first + dx[k]
                    val ny = current.second + dy[k]

                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                        continue
                    }

                    if (visited[nx][ny] || grid[nx][ny] != 1) {
                        continue
                    }

                    visited[nx][ny] = true
                    queue.offer(Pair(nx, ny))
                }

                max = maxOf(max, area)
            }
        }
    }

    println(count)
    println(max)
}