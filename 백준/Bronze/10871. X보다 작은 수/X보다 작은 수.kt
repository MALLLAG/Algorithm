fun main() {
    val (n, x) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    print(list.filter { it < x }.joinToString(" "))
}