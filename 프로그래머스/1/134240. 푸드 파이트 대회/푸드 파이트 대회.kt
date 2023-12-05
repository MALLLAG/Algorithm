class Solution {
    fun solution(
        food: IntArray
    ): String {
        var result = ""
        
        for (i in 1 until food.size) {
            val foodNumber = food[i]
            
            for (j in 0 until foodNumber / 2) {
                result += i
            }
        }
        
        return result + "0" + result.reversed()
    }
}