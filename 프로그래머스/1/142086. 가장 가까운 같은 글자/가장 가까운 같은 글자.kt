class Solution {
    fun solution(
        s: String
    ): IntArray {
        val result = mutableListOf<Int>()
        val maps = mutableMapOf<Char, Int>()
        
        for (i in 'a'..'z') {
            maps.put(i, -1)
        }
        
        for (i in 0 until s.length) {
            if (maps[s[i]] == -1) {
                result.add(maps[s[i]]!!)    
            } else {
                result.add(i - maps[s[i]]!!)    
            }
            
            maps.put(s[i], i)
        }
        
        return result.toIntArray()
    }
}