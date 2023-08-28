import java.util.*

private val dx = intArrayOf(2, 2, 1, 1, -2, -2, -1, -1)
private val dy = intArrayOf(1, -1, 2, -2, 1, -1, 2, -2)

fun main() {
    val t = readln().toInt()

    repeat(t) {
        println(bfs())
    }
}

private fun bfs(): Int {
    val l = readln().toInt()
    val grid = Array(l) { IntArray(l) {0} }
    val visited = Array(l) { BooleanArray(l) {false} }

    val (startX, startY) = readln().split(" ").map { it.toInt() }
    val (endX, endY) = readln().split(" ").map { it.toInt() }

    if (startX == endX && startY == endY) {
        return 0
    }

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.offer(Pair(startX, startY))
    visited[startX][startY] = true

    while (queue.isNotEmpty()) {
        val current = queue.poll()

        if (current.first == endX && current.second == endY) {
            return grid[current.first][current.second]
        }

        for (i in 0 until 8) {
            val nx = current.first + dx[i]
            val ny = current.second + dy[i]

            if (nx < 0 || nx >= l || ny < 0 || ny >= l) {
                continue
            }

            if (visited[nx][ny]) {
                continue
            }

            grid[nx][ny] = grid[current.first][current.second] + 1
            queue.offer(Pair(nx, ny))
            visited[nx][ny] = true
        }
    }

    return -1
}