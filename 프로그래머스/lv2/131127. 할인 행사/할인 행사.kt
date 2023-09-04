fun main() {
    Solution().solution(
        arrayOf("banana", "apple", "rice", "pork", "pot"),
        intArrayOf(3, 2, 2, 2, 1),
        arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")
    )
}

class Solution {
    fun solution(
        want: Array<String>,
        number: IntArray,
        discount: Array<String>
    ): Int {
        var count = 0
        var lt = 0
        var rt = 9

        while(rt < discount.size) {
            val tempList = mutableListOf<Int>()

            for (i in want.indices) {
                val a = want[i]
                val b = number[i]
                var temp = 0

                val list = discount.slice(lt..rt)
                for (j in 0..9) {
                    if (list[j] == a) {
                        temp++
                    }
                }

                tempList.add(temp)
            }

            if (number.contentEquals(tempList.toIntArray())) {
                count++
            }

            lt++
            rt++
        }

        println(count)
        return count
    }
}
