import java.util.Stack

fun main() {
    val str = readln().toCharArray()
    var prev = ' '
    var result = 0
    val stack = Stack<Char>()
    for (i in str) {
        if (i == '(') {
            stack.push(i)
        } else {
            stack.pop()
            if (prev == '(') {
                result += stack.size
            } else {
                result += 1
            }
        }
        prev = i
    }
    println(result)
}