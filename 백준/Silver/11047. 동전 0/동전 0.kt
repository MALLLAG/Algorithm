fun main() {
    var (n, k) = readln().split(" ").map { it.toInt() }
    val list = mutableListOf<Int>()

    repeat(n) {
        list.add(readln().toInt())
    }

    var sum = 0

    for (i in n-1 downTo 0) {
        val temp = k / list[i]
        sum += temp
        k -= temp * list[i]
    }

    println(sum)
}