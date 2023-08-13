fun main() {
    val n = readln().toInt()
    println(factorial(n))
}

private fun factorial(n: Int): Int {
    if (n == 0) return 1
    if (n == 1) return 1
    return n * factorial(n - 1)
}