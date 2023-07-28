import java.util.*

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        list.add(i)
    }

    repeat(m) {
        var (i, j) = readln().split(" ").map { it.toInt() }
        while (i < j) {
            Collections.swap(list, i-1, j-1)
            i++
            j--
        }
    }

    print(list.joinToString(" "))
}