fun main() {
    val list = mutableListOf<Int>()
    repeat(10) {
        list.add(readln().toInt() % 42)
    }
    print(list.distinct().count())
}