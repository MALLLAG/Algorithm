var n = 0
var m = 0
var arr = arrayOf<Int>()
var isUsed = arrayOf<Boolean>()

fun main() {
    val list = readln().split(" ").map { it.toInt() }
    n = list[0]
    m = list[1]
    arr = Array(n + 1) {0}
    isUsed = Array(n + 1) {false}
    dfs(0)
}

private fun dfs(k: Int) {
    if (k == m) {
        for (i in 0 until m) {
            print("${arr[i]} ")
        }
        println()
        return
    }

    for (i in 1..n) {
        if (!isUsed[i]) {
            arr[k] = i
            isUsed[i] = true
            dfs(k + 1)
            isUsed[i] = false
        }
    }
}