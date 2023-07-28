fun main() {
    val n = readln().toInt()
    val sum = readln().split("").filter { it.isNotEmpty() }.sumOf { it.toInt() }
    print(sum)
}