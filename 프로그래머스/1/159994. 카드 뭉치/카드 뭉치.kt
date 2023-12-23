class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var result = "Yes"
        
        var cards1Index = 0
        var cards2Index = 0
        
        for (i in goal.indices) {
            val word = goal[i]
            val cards1Word = cards1[cards1Index]
            val cards2Word = cards2[cards2Index]
            
            if (word == cards1Word) {
                if (cards1Index < cards1.size - 1) cards1Index++
            } else if (word == cards2Word) {
                if (cards2Index < cards2.size - 1) cards2Index++
            } else {
                result = "No"
                return result
            }
        }
        
        return result
    }
}