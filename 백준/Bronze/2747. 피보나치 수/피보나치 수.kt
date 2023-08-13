fun main() {
    val n = readln().toInt()
    println(fibo(n, IntArray(46)))
}

private fun fibo(
    n: Int,
    list: IntArray
): Int {
    list[0] = 0
    list[1] = 1

    for (i in 2..n) {
        list[i] = list[i - 1] + list[i - 2]
    }

    return list[n]
}