class Solution {
    fun solution(
        progresses: IntArray,
        speeds: IntArray
    ): IntArray {
        var index = 0
        val result = mutableListOf<Int>()
        
        while (index < progresses.size) {
            var count = 0
            
            for (i in index until progresses.size) {
                if (progresses[index] >= 100) {
                    count++
                    index++
                }
            }
            
            if (count != 0) {
                result.add(count)
                count = 0
            }

            for (i in progresses.indices) {
                progresses[i] += speeds[i]
            }
        }
        
        return result.toIntArray()
    }
}