import java.util.*

fun main() {
    val k = readln().toInt()
    val stack = Stack<Int>()
    var result = 0

    repeat(k) {
        val number = readln().toInt()

        if (number != 0) {
            stack.push(number)
        } else {
            stack.pop()
        }
    }

    while (stack.isNotEmpty()) {
        result += stack.peek()
        stack.pop()
    }

    println(result)
}