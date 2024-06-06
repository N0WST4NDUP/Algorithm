class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        for (int i=0; i<picture.length; i++) {
            StringBuilder str = new StringBuilder();
            for (String pixel : picture[i].split("")) {
                str.append(pixel.repeat(k));
            }
            
            for (int j=0; j<k; j++) {
                answer[i*k+j] = str.toString();
            }
        }
        return answer;
    }
}