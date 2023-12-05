class Solution {
    fun solution(
        t: String,
        p: String
    ): Int {
        var result = 0
        
        var lt = 0
        var rt = p.length - 1
        
        while (rt < t.length) {
            val slicedWord = t.slice(lt..rt)
            
            if (slicedWord <= p) {
                result++
            }
            
            lt++
            rt++
        }
        
        return result
    }
}