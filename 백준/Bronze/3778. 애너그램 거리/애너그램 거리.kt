import kotlin.math.absoluteValue

fun main() {
    val n = readln().toInt()
    var count = 0
    repeat(n) {
        val a = readln()
        val b = readln()
        val map = mutableMapOf<Char, Int>()
        a.toCharArray()
            .forEach { map[it] = map.getOrDefault(it, 0) + 1 }
        b.toCharArray()
            .forEach { map[it] = map.getOrDefault(it, 0) - 1 }
        var result = 0
        map.values.forEach { result += it.absoluteValue }
        count++
        println("Case #$count: $result")
    }
}