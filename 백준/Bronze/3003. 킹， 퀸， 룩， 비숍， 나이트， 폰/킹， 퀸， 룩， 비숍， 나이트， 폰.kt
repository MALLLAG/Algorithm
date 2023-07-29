fun main() {
    val list = readln().split(" ").map { it.toInt() }.toMutableList()
    val count = listOf(1, 1, 2, 2, 2, 8)
    for (i in list.indices) {
        list[i] = count[i] - list[i]
    }
    print(list.joinToString(" "))
}