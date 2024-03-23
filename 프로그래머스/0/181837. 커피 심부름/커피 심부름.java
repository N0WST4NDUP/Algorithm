class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String menu : order) {
            if (menu.equals("anything")) menu = "iceamericano";
            answer += menu.contains("americano") ? 4500 : 5000;
        }
        return answer;
    }
}