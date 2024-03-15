class Solution {

    public int[] solution(String[] wallpaper) {
        int lux = 0;
        int luy = 0;
        int rdx = 0;
        int rdy = 0;
        int row = wallpaper.length;
        int col = wallpaper[0].length();
        lux:
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = i;
                    break lux;
                }
            }
        }
        luy:
        for (int i=0; i<col; i++) {
            for (int j=0; j<row; j++) {
                if (wallpaper[j].charAt(i) == '#') {
                    luy = i;
                    break luy;
                }
            }
        }
        rdx:
        for (int i=row-1; i>=0; i--) {
            for (int j=col-1; j>=0; j--) {
                if (wallpaper[i].charAt(j) == '#') {
                    rdx = i+1;
                    break rdx;
                }
            }
        }
        rdy:
        for (int i=col-1; i>=0; i--) {
            for (int j=row-1; j>=0; j--) {
                if (wallpaper[j].charAt(i) == '#') {
                    rdy = i+1;
                    break rdy;
                }
            }
        }
        
        int[] answer = {lux,luy,rdx,rdy};
        return answer;
    }
}