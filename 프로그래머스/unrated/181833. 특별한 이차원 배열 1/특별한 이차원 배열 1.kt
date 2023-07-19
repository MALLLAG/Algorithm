class Solution {
    fun solution(n: Int): Array<IntArray> {
        val a = mutableListOf<IntArray>()
        val b = mutableListOf<Int>()

        for (i in 1..n) {
            for (j in 1..n) {
                if (j == i) {
                    b.add(1)
                } else {
                    b.add(0)
                }
            }
            a.add(b.toIntArray())
            b.clear()
        }
        
        return a.toTypedArray()
    }
}