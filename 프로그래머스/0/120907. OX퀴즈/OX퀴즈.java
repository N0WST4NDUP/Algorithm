class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            answer[i] = calc(arr) ? "O" : "X";
        }
        
        return answer;
    }
    
    public boolean calc(String[] arr) {
        int sum = 0;
        switch (arr[1]) {
            case "+" :
                sum = Integer.valueOf(arr[0]) + Integer.valueOf(arr[2]);
                break;
            case "-" :
                sum = Integer.valueOf(arr[0]) - Integer.valueOf(arr[2]);
                break;
        }
        return sum == Integer.valueOf(arr[4]);
    }
}