fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }.sorted()
    var max = 0

    // i  j
    // 93 181 245 214 315 36 185 138 216 295
    for (i in 0 until list.size) {
        for (j in i + 1 until list.size) {
           for (k in j + 1 until list.size) {
               val sum = list[i] + list[j] + list[k]
               if (sum <= m) {
                   max = maxOf(max, sum)
               }
           }
        }
    }

    println(max)
}