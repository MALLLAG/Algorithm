var r = 0
var c = 0
var k = 0
var grid = arrayOf<CharArray>()
var visited = arrayOf<BooleanArray>()
val dx = intArrayOf(1, -1, 0, 0)
val dy = intArrayOf(0, 0, 1, -1)
var count = 0

fun main() {
    val list = readln().split(" ").map { it.toInt() }
    r = list[0]
    c = list[1]
    k = list[2]
    grid = Array(r) { CharArray(c) }
    visited = Array(r) { BooleanArray(c) }

    for (i in 0 until r) {
        grid[i] = readln().split("").filter { it.isNotEmpty() }.map { it.single() }.toCharArray()
    }

    dfs(1, r - 1, 0)

    println(count)
}

fun dfs(
    index: Int,
    x: Int,
    y: Int
) {
    if (index == k && x == 0 && y == c - 1) {
        count++
        return
    }

    visited[x][y] = true

    for (i in 0..3) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
            continue
        }

        if (grid[nx][ny] == 'T' || visited[nx][ny]) {
            continue
        }

        visited[nx][ny] = true
        dfs(index + 1, nx, ny)
        visited[nx][ny] = false
    }

}