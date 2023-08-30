fun main() {
    val list = Array<List<String>>(5) { listOf() }
    var max = 0
    var result = ""

    for (i in 0..4) {
        list[i] = readln().split("").filter { it.isNotEmpty() }
        max = maxOf(list[i].size, max)
    }

    for (i in 0 until max) {
        for (j in 0 until 5) {
            if (list[j].getOrNull(i) != null) {
                result += list[j][i]
            }
        }
    }

    println(result)
}