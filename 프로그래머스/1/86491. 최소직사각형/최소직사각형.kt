class Solution {
    fun solution(
        sizes: Array<IntArray>
    ): Int {
        val sortedList = mutableListOf<IntArray>()
        
        for (i in sizes.indices) {
            val min = minOf(sizes[i][0], sizes[i][1])
            val max = maxOf(sizes[i][0], sizes[i][1])
            
            sortedList.add(intArrayOf(max, min))
        }
        
        var maxWidth = 0
        var maxHeight = 0
        
        for (i in sortedList.indices) {
            maxWidth = maxOf(maxWidth, sortedList[i][0])
            maxHeight = maxOf(maxHeight, sortedList[i][1])
        }
        
        return maxWidth * maxHeight
    }
}