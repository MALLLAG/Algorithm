private var grid = arrayOf<IntArray>()
private var visited = arrayOf<BooleanArray>()
private val dx = intArrayOf(0, 0, -1, 1, -1, -1, 1, 1)
private val dy = intArrayOf(-1, 1, 0, 0, -1, 1, -1, 1)

fun main() {
    while (true) {
        val (w, h) = readln().split(" ").map { it.toInt() }
        var count = 0

        if (w == 0 && h == 0) {
            return
        }

        grid = Array(h) { IntArray(w) }
        visited = Array(h) { BooleanArray(w) }

        for (i in 0 until h) {
            grid[i] = readln().split(" ").map { it.toInt() }.toIntArray()
        }

        for (i in 0 until h) {
            for (j in 0 until w) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    dfs(j, i, w, h)
                    count++
                }
            }
        }

        println(count)
    }
}

private fun dfs(
    x: Int,
    y: Int,
    w: Int,
    h: Int
) {
    visited[y][x] = true

    for (i in 0 until 8) {
        val nx: Int = x + dx[i]
        val ny: Int = y + dy[i]

        if (nx !in 0 until w || ny !in 0 until h) continue
        if (visited[ny][nx] || grid[ny][nx] == 0) continue

        dfs(nx, ny, w, h)
    }
}
