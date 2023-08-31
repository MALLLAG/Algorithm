fun main() {
    var n = readln().toInt()
    var number = 665

    while (n != 0) {
        number++
        if (number.toString().contains("666")) {
            n--
        }
    }

    println(number)
}
