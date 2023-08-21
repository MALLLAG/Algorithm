import java.util.*

private var graph = arrayOf<IntArray>()
private var visited = booleanArrayOf()

fun main() {
    val (n, m, v) = readln().split(" ").map { it.toInt() }
    graph = Array(n) { IntArray(n) }
    visited = BooleanArray(n)

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[a-1][b-1] = 1
        graph[b-1][a-1] = 1
    }

    println(dfs(n, v-1).trimEnd())

    visited.fill(false)
    println(bfs(n, v-1).trimEnd())
}

private fun dfs(
    n: Int,
    v: Int
): String {
    val sb = StringBuilder()
    visited[v] = true
    sb.append("${v+1} ")

    for (i in 0 until n) {
        if (graph[v][i] == 1 && !visited[i]) {
            sb.append(dfs(n, i))
        }
    }

    return sb.toString()
}

private fun bfs(
    n: Int,
    v: Int
): String {
    val sb = StringBuilder()
    val list = LinkedList<Int>()

    list.add(v)
    visited[v] = true
    sb.append("${v+1} ")

    while (list.isNotEmpty()) {
        val current = list.poll()

        for (i in 0 until n) {
            if (graph[current][i] == 1 && !visited[i]) {
                list.add(i)
                visited[i] = true
                sb.append("${i+1} ")
            }
        }
    }

    return sb.toString()
}