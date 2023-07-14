class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        if (arr.size % 2 != 0) {
            for (i in arr.indices) {
                if (i % 2 == 0) {
                    arr[i] += n
                }
            }
        } else {
            for (i in arr.indices) {
                if (i % 2 != 0) {
                    arr[i] += n
                }
            }
        }
        
        return arr
    }
}