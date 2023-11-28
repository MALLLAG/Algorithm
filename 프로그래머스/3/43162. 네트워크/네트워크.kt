class Solution {
    fun solution(
        n: Int, 
        computers: Array<IntArray>
    ): Int {
        var result = 0
        val visited = BooleanArray(n) { false }
        
        for(i in computers.indices){
            if(!visited[i]){
                dfs(visited,computers,i)
                result++
            }
        }
        return result
    }
    
    private fun dfs(
        visited: BooleanArray,
        computers : Array<IntArray>,
        start : Int
    ) {
        visited[start]=true
        
        for(i in computers[start].indices){
            if(computers[start][i]==1 && !visited[i]){
                dfs(visited,computers,i)
            }
        }
    }
}