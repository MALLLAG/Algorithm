fun main() {
    val s = readln()
    val alphabet = listOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )

    print(alphabet.map { s.toCharArray().indexOf(it) }.joinToString(" "))
}