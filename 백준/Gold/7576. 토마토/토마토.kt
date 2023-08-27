import java.util.*

private var grid = arrayOf<IntArray>()
private var dist = arrayOf<IntArray>()
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)

fun main() {
    // 1 익은 토마토
    // 0 익지 않은 토마토
    // -1 토마토 없음
    //    6 4
    //    1 -1 0 0 0 0
    //    0 -1 0 0 0 0
    //    0 0 0 0 -1 0
    //    0 0 0 0 -1 1
    val (m, n) = readln().split(" ").map { it.toInt() }
    grid = Array(n) { intArrayOf(m) }
    dist = Array(n) { IntArray(m) {0} }

    for (i in 0 until n) {
        grid[i] = readln().split(" ").map { it.toInt() }.toIntArray()
    }

    val queue: Queue<Pair<Int, Int>> = LinkedList()

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (grid[i][j] == 1) {
                queue.offer(Pair(i, j))
            }

            if (grid[i][j] == 0) {
                dist[i][j] = -1
            }
        }
    }

    while (queue.isNotEmpty()) {
        val current = queue.poll()

        for (i in 0..3) {
            val nx = current.first + dx[i]
            val ny = current.second + dy[i]

            if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                continue
            }

            if (dist[nx][ny] >= 0) {
                continue
            }

            dist[nx][ny] = dist[current.first][current.second] + 1
            queue.offer(Pair(nx, ny))
        }
    }

    var result = 0
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (dist[i][j] == -1) {
                println(-1)
                return
            }
            result = maxOf(result, dist[i][j])
        }
    }
    println(result)

}