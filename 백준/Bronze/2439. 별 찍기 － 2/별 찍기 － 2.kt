fun main(args: Array<String>) {
    val n = readln().toInt()
    for (i in 1..n) {
        for (j in 1..n) {
            if (n - i >= j) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
}