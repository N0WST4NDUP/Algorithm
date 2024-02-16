class Solution {
    public String solution(String code) {
        int mode = 0;
        String ret = "";
        
        for (int i=0; i<code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = mode^1;
                continue;
            }
            
            if (i%2 == mode) {
                ret += code.charAt(i);
            }
        }
        
        if (ret.length() == 0) {
            ret = "EMPTY";
        }
        return ret;
    }
}