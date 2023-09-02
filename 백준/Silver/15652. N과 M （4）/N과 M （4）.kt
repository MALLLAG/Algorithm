var n = 0
var m = 0
val sb = StringBuilder()
var arr = arrayOf<Int>()

fun main() {
    val list = readln().split(" ").map { it.toInt() }
    n = list[0]
    m = list[1]
    arr = Array(n + 1) {0}

    dfs(1, 0)
    println(sb.toString())
}

private fun dfs(idx: Int, k: Int) {
    if (k == m) {
        for (i in 0 until m) {
            sb.append("${arr[i]} ")
        }
        sb.append("\n")
        return
    }

    for (i in idx..n) {
        arr[k] = i
        dfs(i, k + 1)
    }
}
