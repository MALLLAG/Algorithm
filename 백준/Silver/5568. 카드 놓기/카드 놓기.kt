var n = 0
var k = 0
var cards = arrayOf<Int>()
var arr = arrayOf<Int>()
var isUsed = arrayOf<Boolean>()
var results = mutableSetOf<String>()

fun main() {
    n = readln().toInt()
    k = readln().toInt()
    cards = Array(n) {0}
    arr = Array(n) {0}
    for (i in 0 until n) {
        cards[i] = readln().toInt()
    }
    isUsed = Array(100) {false}
    dfs(0)
    println(results.size)
}

private fun dfs(l: Int) {
    if (l == k) {
        results.add(arr.joinToString(""))
        return
    }

    for (i in 0..cards.size - 1) {
        if (!isUsed[i]) {
            arr[l] = cards[i]
            isUsed[i] = true
            dfs(l + 1)
            isUsed[i] = false
        }
    }
}
