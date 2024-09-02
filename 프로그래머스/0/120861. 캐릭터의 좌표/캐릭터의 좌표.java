class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int width = board[0]/2;
        int height = board[1]/2;
        
        for (String input : keyinput) {
            switch (input.charAt(0)) {
                case 'l' :
                    if (answer[0] > width*-1) answer[0]--;
                    break;
                    
                case 'r' :
                    if (answer[0] < width*1) answer[0]++;
                    break;
                    
                case 'd' :
                    if (answer[1] > height*-1) answer[1]--;
                    break;
                    
                case 'u' :
                    if (answer[1] < height*1) answer[1]++;
                    break;
            }
        }
        return answer;
    }
}