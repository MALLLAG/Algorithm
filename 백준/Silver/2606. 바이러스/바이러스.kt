import java.util.*

private var graph = arrayOf<IntArray>()
private var visited = booleanArrayOf()

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    graph = Array(a+1) { IntArray(a+1) }
    visited = BooleanArray(a+1)

    repeat(b) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        graph[x][y] = 1
        graph[y][x] = 1
    }

    println(bfs())
}

private fun bfs(): Int {
    val queue: Queue<Int> = LinkedList()
    queue.offer(1)
    visited[1] = true
    var count = 0

    while (queue.isNotEmpty()) {
        val current = queue.poll()

        for (i in graph.indices) {
            if (!visited[i] && graph[current][i] == 1) {
                queue.offer(i)
                visited[i] = true
                count++
            }
        }
    }

    return count
}