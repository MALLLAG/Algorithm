class Solution {
    fun solution(numLog: IntArray): String {
        var result = ""
        for (i in 1 until numLog.size) {
            if (numLog[i] - numLog[i-1] == 1) {
                result += "w"
            } else if (numLog[i] - numLog[i-1] == -1) {
                result += "s"
            } else if (numLog[i] - numLog[i-1] == 10) {
                result += "d"
            } else {
                result += "a"
            }
        }
        return result
    }
}