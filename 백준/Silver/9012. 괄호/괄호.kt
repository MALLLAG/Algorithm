import java.util.*

fun main() {
    val n = readln().toInt()
    repeat(n) {
        val str = readln()
        val stack = Stack<Char>()
        var result = "YES"

        for (char in str.toCharArray()) {
            if (char == '(') {
                stack.push(char)
            } else {
                if (stack.isEmpty()) {
                    result = "NO"
                } else {
                    stack.pop()
                }
            }
        }

        if (stack.isNotEmpty()) {
            result = "NO"
        }

        println(result)
    }
}