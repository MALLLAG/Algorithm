import java.util.*

class Solution {
    fun solution(s: String): Int {
        var result = 0
        
        if (s.length % 2 != 0) return 0

        for (i in 0 until s.length) {
            val rotationWord = s.drop(i) + s.slice(0..i)
            if (isValid(rotationWord)) result++
        }

        return result
    }

    private fun isValid(rotationWord: String): Boolean {
        val stack = Stack<Char>()

        for (word in rotationWord.toCharArray()) {
            when (word) {
                '(', '[', '{' -> stack.push(word)
                ')' -> if (stack.isEmpty() || stack.peek() != '(') return false else stack.pop()
                ']' -> if (stack.isEmpty() || stack.peek() != '[') return false else stack.pop()
                '}' -> if (stack.isEmpty() || stack.peek() != '{') return false else stack.pop()
            }
        }
        
        return true
    }
}