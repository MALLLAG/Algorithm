fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toDouble() }
    val m = list.max()
    print(list.map { it / m * 100 }.average())
}