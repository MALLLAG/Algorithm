class Solution {
    fun solution(arr: Array<IntArray>): Int {
        var result = 0

        for (i in arr.indices) {
            for (j in arr.indices) {
                if (arr[i][j] != arr[j][i]) {
                    result +=1
                }
            }
        }

        return if (result == 0) {
            1
        } else {
            0
        }
    }
}