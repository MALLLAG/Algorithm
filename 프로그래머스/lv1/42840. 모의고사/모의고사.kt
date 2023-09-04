class Solution {
    fun solution(answers: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val list1 = intArrayOf(1, 2, 3, 4, 5)
        val list2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val list3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        var index1 = 0
        var index2 = 0
        var index3 = 0
        var result1 = 0
        var result2 = 0
        var result3 = 0
        
        for (i in answers.indices) {
            if (index1 == list1.size) {
                index1 = 0
            }
            if (index2 == list2.size) {
                index2 = 0
            }
            if (index3 == list3.size) {
                index3 = 0
            }
            
            if (answers[i] == list1[index1]) {
                result1++
            }
            if (answers[i] == list2[index2]) {
                result2++
            }
            if (answers[i] == list3[index3]) {
                result3++
            }
            
            index1++
            index2++
            index3++
        }
        
        if (result1 == maxOf(result1, result2, result3)) {
            result.add(1)
        }
        if (result2 == maxOf(result1, result2, result3)) {
            result.add(2)
        }
        if (result3 == maxOf(result1, result2, result3)) {
            result.add(3)
        }
        
        println(result1)
        println(result2)
        println(result3)
        return result.toIntArray()
    }
}