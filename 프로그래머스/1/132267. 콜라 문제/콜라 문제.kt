class Solution {
    fun solution(
        a: Int,
        b: Int,
        n: Int
    ): Int {
        var temp = n
        var result = 0
        var remainQuantity = 0
        
        while(temp >= a){
            remainQuantity = temp / a * b
            result += remainQuantity
            
            temp = temp % a + remainQuantity
        }
        
        return result
    }
}