class Solution {
    fun solution(left: Int, right: Int): Int {
        var result = 0
        
        for (i in left..right) {
            var count = 0
            
            for (j in 1..i) {
                if (i % j == 0) {
                    count++
                }
            }
            
            if (count % 2 == 0) {
                result += i
            } else {
                result -= i
            }
        }
        
        return result
    }
}