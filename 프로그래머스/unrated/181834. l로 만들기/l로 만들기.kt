class Solution {
    fun solution(myString: String): String {
        var result = ""

        myString.map {
            if (it < 'l') {
                result += 'l'
            } else {
                result += it
            }
        }

        return result
    }
}