import java.util.*

private var grid = arrayOf<IntArray>()
private var visited = arrayOf<BooleanArray>()
private val dx = intArrayOf(1, -1, 0, 0)
private val dy = intArrayOf(0, 0, 1, -1)
private var count = 0
private val list = mutableListOf<Int>()

fun main() {
    val n = readln().toInt()
    visited = Array(n) { BooleanArray(n) }
    grid = Array(n) { IntArray(n) }

    for (i in 0 until n) {
        grid[i] = readln().split("").filter { it.isNotEmpty() }.map { it.toInt() }.toIntArray()
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (grid[i][j] == 0 || visited[i][j]) {
                continue
            }

            count++

            val queue: Queue<Pair<Int, Int>> = LinkedList()
            queue.offer(Pair(i, j))
            visited[i][j] = true

            var temp = 0

            while(queue.isNotEmpty()) {
                val current = queue.poll()
                temp++

                for (k in 0..3) {
                    val nx = current.first + dx[k]
                    val ny = current.second + dy[k]

                    if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                        continue
                    }

                    if (visited[nx][ny] || grid[nx][ny] == 0) {
                        continue
                    }

                    queue.offer(Pair(nx, ny))
                    visited[nx][ny] = true
                }
            }

            list.add(temp)
        }
    }

    println(count)
    list.sorted().forEach { println(it) }
}