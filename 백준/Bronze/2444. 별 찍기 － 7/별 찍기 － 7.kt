fun main() {
    val N = readLine()!!.toInt()
    
    for (i in 1 until N) {
        for (j in 1 until N - i + 1) {
            print(" ")
        }
        for (j in 1 until 2 * i) {
            print("*")
        }
        println()
    }
    
    for (i in N downTo 1) {
        for (j in 1 until N - i + 1) {
            print(" ")
        }
        for (j in 1 until 2 * i) {
            print("*")
        }
        println()
    }
}