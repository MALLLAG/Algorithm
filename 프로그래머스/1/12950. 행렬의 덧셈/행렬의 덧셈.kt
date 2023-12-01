class Solution {
    fun solution(
        arr1: Array<IntArray>,
        arr2: Array<IntArray>
    ): Array<IntArray> {
        var result = Array(arr1.count()) { IntArray(arr1[0].count()) { 0 } }
        
        for (i in arr1.indices) {
            for (j in arr1[i].indices) {
                result[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        
        return result
    }
}