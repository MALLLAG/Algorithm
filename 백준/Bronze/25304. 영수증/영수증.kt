fun main(args: Array<String>) {
    val pay = readln().toInt()
    val count = readln().toInt()
    var calculatePrice = 0
    repeat(count) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        calculatePrice += a * b
    }
    if (pay == calculatePrice) {
        print("Yes")
    } else {
        print("No")
    }
}