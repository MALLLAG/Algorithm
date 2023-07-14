class Solution {
    fun solution(arr1: IntArray, arr2: IntArray): Int {
        if (arr1.size != arr2.size) {
            return if (arr1.size > arr2.size) {
                1
            } else {
                -1
            }
        } else {
            val sum1 = arr1.sum()
            val sum2 = arr2.sum()
            
            return if (sum1 == sum2) {
                0
            } else if (sum1 > sum2) {
                1
            } else {
                -1
            }
        }
    }
}