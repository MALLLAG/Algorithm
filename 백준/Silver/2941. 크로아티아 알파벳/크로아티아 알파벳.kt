fun main() {
    var word = readln()
    val list = listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    list.forEach {
        word = word.replace(it, " ")
    }
    print(word.length)
}