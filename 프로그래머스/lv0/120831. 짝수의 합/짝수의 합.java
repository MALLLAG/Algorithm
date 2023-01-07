class Solution {
    public int solution(int n) {
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 0) {
                result += i + 1;
            }
        }
        
        return result;
    }
}