import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = new String[numbers.length];
        for (int i=0; i<strArr.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strArr, new OwnComp());
        
        if (strArr[0].equals("0")) return "0";
        for (String str : strArr) {
            answer.append(str);
        }
        return answer.toString();
    }
}

class OwnComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        while(true) {
            if(s1.length() ==  s2.length())
                return s2.compareTo(s1);
            if(s1.length() <  s2.length()) {
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i))
                        return s2.substring(i, i + 1).compareTo(s1.substring(i, i + 1));
                }
                s2 = s2.substring(s1.length());
            }
            if(s1.length() >  s2.length()) {
                for (int i = 0; i < s2.length(); i++) {
                    if (s1.charAt(i) != s2.charAt(i))
                        return s2.substring(i, i + 1).compareTo(s1.substring(i, i + 1));
                }
                s1 = s1.substring(s2.length());
            }
        }
    }
}