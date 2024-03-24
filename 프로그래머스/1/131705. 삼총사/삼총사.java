class Solution {
    int answer = 0;
    
    public int solution(int[] number) {
        dfs(number, new boolean[number.length], 0, 0);
        return answer;
    }
    
    public void dfs(int[] number, boolean[] visited,  int depth, int idx) {
        if (depth == 3) {
            int sum = 0;
            
            for (int i = 0; i<visited.length; i++) {
                if (!visited[i]) continue;
                sum += number[i];
            }
            
            if (sum == 0) answer++;
            return;
        }
        
        for (int i=idx; i<number.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            dfs(number,visited,depth+1, i+1);
            visited[i] = false;
        }
    }
}