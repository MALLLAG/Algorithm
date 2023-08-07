import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val grid = Array(9) { IntArray(9) }
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            grid[i][j] = scanner.nextInt()
        }
    }

    var max = 0
    var a = 0
    var b = 0
    for (i in 0 until 9) {
        for (j in 0 until 9) {
            max = maxOf(max, grid[i][j])
            if (max == grid[i][j]) {
                a = i + 1
                b = j + 1
            }
        }
    }

    println(max)
    println("$a $b")
}