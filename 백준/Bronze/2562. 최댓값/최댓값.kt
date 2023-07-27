fun main() {
    val list = mutableListOf<Int>()
    repeat(9) {
        list.add(readln().toInt())
    }
    val max = list.max()
    println(max)
    println(list.indexOf(max) + 1)
}