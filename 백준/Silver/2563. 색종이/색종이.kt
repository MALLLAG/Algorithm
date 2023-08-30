private var grid = arrayOf<IntArray>()

fun main() {
    val n = readln().toInt()
    grid = Array(100) { IntArray(100) {0} }
    var count = 0

    repeat(n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        for (i in x - 1 until x + 9) {
            for (j in y - 1 until y + 9) {
                if (grid[i][j] == 0) {
                    grid[i][j] = 1
                    count++
                }
            }
        }
    }

    println(count)
}