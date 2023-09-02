var n = 0
var m = 0
var list = arrayOf<Int>()
var arr = arrayOf<Int>()
var isUsed = arrayOf<Boolean>()
val sb = StringBuilder()

fun main() {
    val nm = readln().split(" ").map { it.toInt() }
    list = readln().split(" ").map { it.toInt() }.sorted().toTypedArray()
    n = nm[0]
    m = nm[1]
    arr = Array(n + 1) {0}
    isUsed = Array(n + 1) {false}

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

    for (i in 0 until n) {
        if (!isUsed[i]) {
            arr[k] = list[i]
            isUsed[i] = true
            dfs(k + 1)
            isUsed[i] = false
        }
    }
}