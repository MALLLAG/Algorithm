fun main() {
    val list = mutableListOf<Int>()
    for (i in 1..30) {
        list.add(i)
    }
    repeat(28) {
        list.remove(readln().toInt())
    }
    println(list[0])
    println(list[1])
}