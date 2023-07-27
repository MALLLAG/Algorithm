fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = IntArray(n).toMutableList()
    repeat(m) {
        val (i, j, k) = readln().split(" ").map { it.toInt() }
        for (p in i-1..j-1) {
            list[p] = k
        }
    }
    print(list.joinToString(" "))
}