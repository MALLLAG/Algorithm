class Solution {
    var visited = arrayOf<Boolean>()
    var result = 0

    fun solution(
        begin: String,
        target: String,
        words: Array<String>
    ): Int {
        visited = Array(words.size) {false}

        dfs(0, begin, target, words)

        return result
    }

    fun dfs(
        index: Int,
        current: String,
        target: String,
        words: Array<String>
    ) {
        if (current == target) {
            result = index
            return
        }

        for (i in words.indices) {
            if (!visited[i] && canTransform(current, words[i])) {
                visited[i] = true
                dfs(index + 1, words[i], target, words)
                visited[i] = false
            }
        }
    }

    fun canTransform(
        begin: String,
        end: String
    ): Boolean {
        val length = begin.length
        var count = 0

        for (i in 0 until length) {
            if (begin[i] == end[i]) {
                count++
            }
        }

        return length - count == 1
    }
}