class Solution {
    fun solution(
        name: Array<String>,
        yearning: IntArray,
        photo: Array<Array<String>>
    ): IntArray {
        var result = mutableListOf<Int>()
        val map = mutableMapOf<String, Int>()
        
        for (i in name.indices) {
            map.put(name[i], yearning[i])
        }
        
        for (i in photo.indices) {
            var score = 0
            
            for (j in photo[i].indices) {
                score += map.get(photo[i][j]) ?: 0
            }
            
            result.add(score)
        }
        
        return result.toIntArray()
    }
}