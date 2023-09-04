class Solution {
    var result = 0

    fun solution(
        numbers: IntArray,
        target: Int
    ): Int {
        dfs(numbers, 0, target, 0)

        return result
    }

    fun dfs(
        numbers: IntArray,
        index: Int,
        target: Int,
        sum: Int
    ) {
        if (index == numbers.size) {
            if (sum == target) {
                result++
            }
        } else {
            dfs(numbers, index + 1, target, sum + numbers[index])
            dfs(numbers, index + 1, target, sum - numbers[index])
        }
    }
}