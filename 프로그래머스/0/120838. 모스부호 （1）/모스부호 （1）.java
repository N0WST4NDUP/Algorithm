import java.util.*;

class Solution {
    String[] morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'".replaceAll("[':a-z]","").split(",");
        
    public String solution(String letter) {
        StringBuilder answer = new StringBuilder();
        Map<String, Character> morseMap = new HashMap<>();
        for (int i=0; i<morse.length; i++) {
            morseMap.put(morse[i], (char)('a'+i));
        }
        for (String str : letter.split(" ")) {
            answer.append(morseMap.get(str));
        }
        return answer.toString();
    }
}