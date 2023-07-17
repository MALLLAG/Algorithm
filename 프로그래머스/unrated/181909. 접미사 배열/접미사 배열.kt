class Solution {
    fun solution(my_string: String): Array<String> {
        val result = mutableListOf<String>()
        var word = my_string
        
        for (i in my_string.split("")) {
            if (word.isNotEmpty()) {
                result.add(word)
                word = word.drop(1)
            }
        }

        return result.sorted()
            .toTypedArray()
    }
}