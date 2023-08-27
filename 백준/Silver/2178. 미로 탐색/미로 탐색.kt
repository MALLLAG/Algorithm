import java.util.*

private var grid = arrayOf<IntArray>()
private var dist = arrayOf<IntArray>()
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    grid = Array(n) { intArrayOf(m) }
    dist = Array(n) { IntArray(m){0} }

    for (i in 0 until n) {
        grid[i] = readln().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toIntArray()
    }

    for (i in 0 until n) {
        for (j in 0 until m) {
            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.offer(Pair(0, 0))
            dist[0][0] = 1

            while (queue.isNotEmpty()) {
                val current = queue.poll()

                for (k in 0..3) {
                    val nx = current.first + dx[k]
                    val ny = current.second + dy[k]

                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                        continue
                    }

                    if (grid[nx][ny] == 0 || dist[nx][ny] > 0) {
                        continue
                    }

                    dist[nx][ny] = dist[current.first][current.second] + 1
                    queue.offer(Pair(nx, ny))
                }
            }
        }
    }

    println(dist[n-1][m-1])
}