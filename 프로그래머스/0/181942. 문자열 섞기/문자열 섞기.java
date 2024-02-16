class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
    	char a[] = str1.toCharArray();
    	char b[] = str2.toCharArray();
    	for (int i=0; i<a.length; i++) {
    		answer += Character.toString(a[i])+Character.toString(b[i]);
    	}
    	return answer;
    }
}