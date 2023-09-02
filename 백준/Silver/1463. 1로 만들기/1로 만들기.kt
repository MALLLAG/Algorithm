fun main() {
    val n = readln().toInt()
    val d = IntArray(n + 1)

    // 10
    // 10 -> 5 -> 4 -> 2 -> 1
    // 10 -> 9 -> 3 -> 1

    // d[n]
    // d[n] = minOf(d[n-1] + 1, d[n/3] + 1, d[n/2] + 1)
    for (i in 2..n) {
        d[i] = d[i - 1] + 1

        if (i % 3 == 0) {
            d[i] = minOf(d[i], d[i / 3] + 1)
        }

        if (i % 2 == 0) {
            d[i] = minOf(d[i], d[i / 2] + 1)
        }
    }

    println(d[n])
}