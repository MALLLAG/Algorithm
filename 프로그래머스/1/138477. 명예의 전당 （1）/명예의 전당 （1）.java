import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        
        List<Integer> ranking = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            ranking.add(score[i]);
            
            if (ranking.size() > k) {
                ranking.remove(Collections.min(ranking));
            }
            
            result[i] = Collections.min(ranking);
        }
        
        return result;
    }
}
