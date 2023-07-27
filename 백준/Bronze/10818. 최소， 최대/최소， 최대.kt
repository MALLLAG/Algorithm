fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val max = list.max()
    val min = list.min()
    print("$min $max")
}