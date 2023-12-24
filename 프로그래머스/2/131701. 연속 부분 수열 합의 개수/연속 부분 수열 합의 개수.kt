class Solution {
    fun solution(elements: IntArray): Int {
        // 7 9 1 1 4 7 9 1 1 4
        
        val sums = mutableSetOf<Int>()
        val twiceElements = elements + elements

        for (i in 1..elements.size) {
            for (j in 0 until elements.size) {
                sums.add(
                    twiceElements.copyOfRange(j, j + i).sumOf { it }
                )
            }
        }

        return sums.count()
    }
}