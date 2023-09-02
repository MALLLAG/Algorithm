fun main() {
    val n = readln().toInt()
    val stairs = IntArray(n + 1) {0}
    val dp = IntArray(n + 1) {0}

    for (i in 1..n) {
        stairs[i] = readln().toInt()
    }
    
    // dp[3] = maxOf(stairs[1] + stairs[3], stairs[2] + stairs[3])
    // dp[4] = maxOf(stairs[1] + stairs[2] + stairs[4], stairs[1] + stairs[3] + stairs[4])

    for (i in 1..n) {
        when (i) {
            1 -> dp[i] = stairs[i]
            2 -> dp[i] = stairs[i] + stairs[i - 1]
            else -> dp[i] = maxOf((stairs[i] + dp[i - 2]), (stairs[i] + stairs[i - 1] + dp[i - 3]))
        }
    }

    println(dp[n])
}