class Solution {
    fun solution(
        phone_number: String
    ): String {
        var code = ""
        (1..phone_number.length - 4)
            .forEach { code += "*" }
        
        return phone_number.replaceRange(0..phone_number.length - 5, code)
    }
}