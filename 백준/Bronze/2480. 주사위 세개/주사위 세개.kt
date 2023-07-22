fun main(args: Array<String>) {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    if (a == b && b == c) {
        print(10000 + a * 1000)
    } else if (a != b && b != c && c != a) {
        val max = maxOf(a, b, c)
        print(max * 100)
    } else {
        val d = if (a == b) {
            a
        } else if (b == c) {
            b
        } else {
            c
        }
        print(1000 + d * 100)
    }
}