class Solution {
    public int solution(int angle) {
        switch (angle) {
            case 90:
                return 2;
            case 180:
                return 4;
            default:
                return angle < 90 ? 1 : 3;
        }
    }
}