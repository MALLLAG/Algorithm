fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (word1, word2) = readln().split(" ")
        val map = mutableMapOf<Char, Int>()
        word1.toCharArray()
            .onEach { map[it] = map.getOrDefault(it, 0) + 1 }

        word2.toCharArray()
            .onEach { map[it] = map.getOrDefault(it, 0) - 1 }

        var result = true
        map.values.forEach { if (it != 0) result = false }

        if (result) {
            println("$word1 & $word2 are anagrams.")
        } else {
            println("$word1 & $word2 are NOT anagrams.")
        }
    }
}