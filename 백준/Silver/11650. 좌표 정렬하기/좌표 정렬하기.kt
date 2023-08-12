import java.util.*

fun main() {
    val n = readln().toInt()
    val scanner = Scanner(System.`in`)
    val list = Array(n) { IntArray(2) }.toMutableList()
    for (i in 0 until n) {
        for (j in 0..1) {
            list[i][j] = scanner.nextInt()
        }
    }

    val sortedList = list.sortedWith(compareBy({ it[0] }, { it[1] }))
    for (i in 0 until n) {
        println(sortedList[i].joinToString(" "))
    }
}