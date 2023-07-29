import java.util.*

fun main() {
    val (a, b) = readln().split(" ")
        .map { it.toCharArray().toMutableList() }
        .onEach { Collections.swap(it, 0, 2) }

    val aa = a.joinToString("")
    val bb = b.joinToString("")
    print(maxOf(aa, bb))
}