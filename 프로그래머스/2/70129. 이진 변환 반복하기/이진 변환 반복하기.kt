class Solution {
    fun solution(
        s: String
    ): IntArray {
        val result = IntArray(2) { 0 }
        var temp = s

        while (temp != "1") {
            result[0]++
            result[1] += temp.replace("1", "").length
            temp = temp.replace("0", "").length.toString(2)
        }
        
        return result
    }
}