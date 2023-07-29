fun main() {
    val word = readln().uppercase()
    val charCountMap = mutableMapOf<Char, Int>()

    word.forEach {
        charCountMap[it] = charCountMap.getOrDefault(it, 0) + 1
    }

    val maxCount = charCountMap.values.max()
    val mostFrequentChars = charCountMap.filterValues { it == maxCount }.keys

    if (mostFrequentChars.size == 1) {
        print(mostFrequentChars.first().uppercase())
    } else {
        print("?")
    }
}