fun main() {
    val word = readln()
    val reverseWord = word.reversed()
    if (word == reverseWord) {
        print(1)
    } else {
        print(0)
    }
}