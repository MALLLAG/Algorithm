var list = arrayOf<Pair<Int, Int>>()
var visited = arrayOf<Boolean>()
var result = 0

fun main() {
    val n = readln().toInt()
    list = Array(n) { Pair(0, 0) }
    visited = Array(n) { false }

    for (i in 0 until n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        list[i] = Pair(a, b)
    }

    dfs(0, 0)
    println(result)
}

fun dfs(
    index: Int,
    current: Int
) {
    if (index == list.size) {
        result = maxOf(result, current)
        return
    }

    dfs(index + 1, current)

    if (index + list[index].first <= list.size) {
        dfs(index + list[index].first, current + list[index].second)
    }
}