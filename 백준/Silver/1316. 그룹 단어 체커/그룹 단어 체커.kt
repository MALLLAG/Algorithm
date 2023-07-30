fun main() {
    val n = readln().toInt()
    var count = 0
    repeat(n) {
        val word = readln()
        val set = mutableSetOf<Char>()
        var previous = ' '
        var duplicated = false

        for (c in word) {
            if (previous != c) {
                if (!set.add(c)) {
                    duplicated = true
                    break
                }
            }
            previous = c
        }

        if (!duplicated) count++
    }
    print(count)
}