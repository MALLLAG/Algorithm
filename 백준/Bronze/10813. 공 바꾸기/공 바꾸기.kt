import java.util.*

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = IntArray(n).toMutableList()
    for (i in list.indices) {
        list[i] = i + 1
    }
    repeat(m) {
        val (i, j) = readln().split(" ").map { it.toInt() }
        Collections.swap(list, i-1, j-1)
    }
    print(list.joinToString(" "))
}