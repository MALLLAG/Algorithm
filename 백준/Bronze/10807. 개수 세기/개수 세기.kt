fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val v = readln().toInt()
    print(list.filter { it == v }.count())
}