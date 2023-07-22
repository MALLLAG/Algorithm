class Solution {
    fun solution(x: Int): Boolean {
        var a = x
        var sum = 0
        while (a != 0) {
            sum += a % 10
            a /= 10
        }
        
        return x % sum == 0
    }
}