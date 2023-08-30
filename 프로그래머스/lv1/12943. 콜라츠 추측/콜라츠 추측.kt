class Solution {
    fun solution(num: Int): Int {
        var a = num.toLong()
        var count = 0

        if (a == 1L) {
            return 0
        }

        while(a != 1L) {
            count++

            if (a % 2 == 0L) {
                a /= 2
            } else {
                a = a * 3 + 1
            }

            if (count == 500) {
                return -1
            }
        }

        return count
    }
}