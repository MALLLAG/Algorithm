class Solution {
    fun solution(my_string: String, alp: String): String {
        var result = ""

        for (i in my_string) {
            if (i == alp[0]) {
                result += i.uppercase()
            } else {
                result += i
            }
        }
        
        return result
    }
}