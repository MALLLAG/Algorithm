fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (r, s) = readln().split(" ")
        var result = ""
        for (char in s) {
            repeat(r.toInt()) {
                result += char
            }
        }

        println(result)
    }
}