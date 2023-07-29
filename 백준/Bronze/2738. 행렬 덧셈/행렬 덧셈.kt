import java.util.*

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = Array(n) { IntArray(m) }
    val b = Array(n) { IntArray(m) }

    val scanner = Scanner(System.`in`)

    for (i in 0..n-1) {
        for (j in 0..m - 1) {
            a[i][j] = scanner.nextInt()
        }
    }

    for (i in 0..n-1) {
        for (j in 0..m - 1) {
            b[i][j] = scanner.nextInt()
        }
    }

    for (i in 0..n-1) {
        for (j in 0..m - 1) {
            a[i][j] += b[i][j]
        }
    }

    for (i in 0..n-1) {
        for (j in 0..m - 1) {
            print("${a[i][j]} ")
        }
        println()
    }
}