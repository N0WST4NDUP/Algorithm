import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int w = park[0].length();
        int h = park.length;
        for (int i=0; i<park.length; i++) {
            if (park[i].contains("S")) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
        }
        for (String route : routes) {
            String[] cmd = route.split(" ");
            switch (cmd[0]) {
                case "E" :
                    label:
                    if (answer[1]+Integer.parseInt(cmd[1]) < w) {
                        for (int i=answer[1]; i<=answer[1]+Integer.parseInt(cmd[1]); i++) {
                            if (park[answer[0]].charAt(i) == 'X') break label;
                        }
                        answer[1] += Integer.parseInt(cmd[1]);
                    }
                    break;
                case "W" :
                    label:
                    if (answer[1]-Integer.parseInt(cmd[1]) >= 0) {
                        for (int i=answer[1]; i>=answer[1]-Integer.parseInt(cmd[1]); i--) {
                            if (park[answer[0]].charAt(i) == 'X') break label;
                        }
                        answer[1] -= Integer.parseInt(cmd[1]);
                    }
                    break;
                case "S" :
                    label:
                    if (answer[0]+Integer.parseInt(cmd[1]) < h) {
                        for (int i=answer[0]; i<=answer[0]+Integer.parseInt(cmd[1]); i++) {
                            if (park[i].charAt(answer[1]) == 'X') break label;
                        }
                        answer[0] += Integer.parseInt(cmd[1]);
                    }
                    break;
                case "N" :
                    label:
                    if (answer[0]-Integer.parseInt(cmd[1]) >= 0) {
                        for (int i=answer[0]; i>=answer[0]-Integer.parseInt(cmd[1]); i--) {
                            if (park[i].charAt(answer[1]) == 'X') break label;
                        }
                        answer[0] -= Integer.parseInt(cmd[1]);
                    }
                    break;
            }
        }
        return answer;
    }
}