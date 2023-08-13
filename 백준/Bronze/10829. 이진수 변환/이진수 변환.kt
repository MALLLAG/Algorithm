fun main() {
    val n = readln().toLong()
    re(n)
}

private fun re(n: Long) {
    if (n == 0L) return
    re(n / 2)
    print(n % 2)
}