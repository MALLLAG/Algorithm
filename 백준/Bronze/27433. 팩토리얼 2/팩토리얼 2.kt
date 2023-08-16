import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toLong()
    println(factorial(n))
}

private fun factorial(n: Long): Long {
    if (n == 0L) return 1
    return n * factorial(n-1)
}