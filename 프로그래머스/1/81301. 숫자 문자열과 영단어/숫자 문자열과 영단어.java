class Solution {
    public int solution(String s) {
        int answer = 0;
        for (int i=0; i<s.length(); i++) {
            answer *= 10;
            char c = s.charAt(i);
            if (c>='0' && c<='9') {answer += c-'0'; continue;}
            
            switch (c) {
                case 'z' :
                    answer += 0;
                    i += 3;
                    break;
                    
                case 'o' :
                    answer += 1;
                    i += 2;
                    break;
                    
                case 't' :
                    if (s.charAt(i+1) == 'w') {
                        answer += 2;
                        i += 2;
                    } else {
                        answer += 3;
                        i += 4;
                    } break;
                    
                case 'f' :
                    answer += s.charAt(i+1) == 'o' ? 4 : 5;
                    i += 3;
                    break;
                    
                case 's' :
                    if (s.charAt(i+1) == 'i') {
                        answer += 6;
                        i += 2;
                    } else {
                        answer += 7;
                        i += 4;
                    } break;
                    
                case 'e' :
                    answer += 8;
                    i += 4;
                    break;
                    
                case 'n' :
                    answer += 9;
                    i += 3;
                    break;
                    
                default :
                    break;
            }
        }
        return answer;
    }
}