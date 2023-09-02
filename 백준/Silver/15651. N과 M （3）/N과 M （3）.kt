var n = 0
var m = 0
var arr = arrayOf<Int>()
val sb = StringBuilder()

fun main() {
    val list = readln().split(" ").map { it.toInt() }
    n = list[0]
    m = list[1]
    arr = Array(n + 1) {0}

    dfs(0)
    println(sb.toString())
}

private fun dfs(k: Int) {
    if (k == m) {
        for (i in 0 until m) {
            sb.append("${arr[i]} ")
        }
        sb.append("\n")
        return
    }

    for (i in 1..n) {
        arr[k] = i
        dfs(k + 1)
    }
}