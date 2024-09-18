import java.util.*;

class Solution {
    public String solution(String video_len, String pos, 
                           String op_start, String op_end, String[] commands) {
        
        int max = convert(video_len);
        int curr = convert(pos);
        int ops = convert(op_start);
        int ope = convert(op_end);
        
        if (ops <= curr && curr < ope) curr = ope;
        
        for (String cmd : commands) {
            if (cmd.equals("prev")) curr -= 10;
            if (cmd.equals("next")) curr += 10;
            
            if (curr < 0) curr = 0;
            if (ops <= curr && curr < ope) curr = ope;
            if (max < curr) curr = max;
        }
        
        return convert(curr);
    }
    
    public int convert(String time) {
        String[] times = time.split(":");
        return Integer.parseInt(times[0])*60 + Integer.parseInt(times[1]);
    }
    
    public String convert(int time) {
        String mm = String.valueOf(time/60);
        String ss = String.valueOf(time%60);
        return (mm.length() < 2 ? "0" + mm : mm) + ":" + (ss.length() < 2 ? "0" + ss : ss);
    }
}