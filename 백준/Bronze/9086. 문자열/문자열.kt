fun main() {
    val t = readln().toInt()
    repeat(t) {
        val a = readln()
        val first = a[0]
        val last = a[a.lastIndex]
        println("$first$last")
    }
}