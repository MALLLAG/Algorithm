fun main() {
    val n = 5
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(readln().toInt())
    }
    println(list.average().toInt())
    println(list.sorted()[n / 2])
}