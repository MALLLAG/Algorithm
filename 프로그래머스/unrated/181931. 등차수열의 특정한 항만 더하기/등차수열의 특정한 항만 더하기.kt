class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var aa = a
        val list = mutableListOf<Int>()
        for (i in included.indices) {
            list.add(aa)
            aa += d
        }
        
        var result = 0
        for (i in included.indices) {
            if (included[i]) {
                result += list[i]
            }
        }
        return result
    }
}