class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        for (i in strArr.indices) {
            if (i % 2 == 0) {
                strArr[i] = strArr[i].lowercase()
            } else {
                strArr[i] = strArr[i].uppercase()
            }
        }
        return strArr
    }
}