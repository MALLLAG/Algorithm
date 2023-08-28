fun main() {
    val n = readln().toInt()
    var list = mutableListOf<Pair<Int, Int>>()

    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        list.add(Pair(a, b))
    }

    list.sortWith(compareBy({it.second}, {it.first}))

    var count = 0
    var time = 0


    for (i in list.indices) {
        if (time <= list[i].first) {
            count++
            time = list[i].second
        }
    }

    println(count)
}