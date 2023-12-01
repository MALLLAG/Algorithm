class Solution {
    fun solution(
        price: Int,
        money: Int,
        count: Int
    ): Long {
        var accumulatePrice = 0L
        
        for (i in 1..count) {
            accumulatePrice += i * price
        }
        
        return if (accumulatePrice >= money) {
            accumulatePrice - money
        } else {
            0
        }
    }
}