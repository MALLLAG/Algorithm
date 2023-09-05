fun main() {
    val n = readln().toInt()
    val array = Array(n + 1) { IntArray(n + 1) {0} }

    for (i in 0 until n) {
        array[i] = readln().split(" ").map { it.toInt() }.toIntArray()
    }

    // n = 1
    // dp[1][1] = 7

    // n = 2
    // dp[2][1] = dp[1][1] + dp[2][1]
    // dp[2][2] = dp[1][1] + dp[2][2]

    // n = 3
    // dp[3][1] = dp[2][1] + dp[3][1]
    // dp[3][2] = dp[2][1] + dp[3][2]
    // dp[3][2] = dp[2][2] + dp[3][2]
    // dp[3][3] = dp[2][2] + dp[3][3]

    for (i in 1 until n) {
        for (j in 0 .. i) {
            when (j) {
                0 -> array[i][j] = array[i - 1][j] + array[i][j]
                i -> array[i][j] = array[i - 1][j - 1] + array[i][j]
                else -> array[i][j] = array[i][j] + maxOf(array[i - 1][j], array[i - 1][j - 1])
            }
        }
    }

    println(array[n - 1].max())
}
