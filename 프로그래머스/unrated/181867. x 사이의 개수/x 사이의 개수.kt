class Solution {
    fun solution(myString: String): IntArray {
        return myString.split("x")
            .map { it.toCharArray().size }
            .toIntArray()
    }
}