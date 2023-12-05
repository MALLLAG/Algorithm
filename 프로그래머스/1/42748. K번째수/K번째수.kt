class Solution {
    fun solution(
        array: IntArray,
        commands: Array<IntArray>
    ): IntArray {
        val result = mutableListOf<Int>()
        
        for (i in commands.indices) {
            val slicedArray = array.slice(commands[i][0] - 1..commands[i][1] - 1).sorted()
            result.add(slicedArray[commands[i][2] - 1])
        }
        
        return result.toIntArray()
    }
}