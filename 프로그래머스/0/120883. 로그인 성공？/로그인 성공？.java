import java.util.*;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        Map<String, String> dbMap = new HashMap<>();
        
        for (int i=0; i<db.length; i++) {
            dbMap.put(db[i][0], db[i][1]);
        }
        
        return dbMap.containsKey(id_pw[0]) ? dbMap.get(id_pw[0]).equals(id_pw[1]) ? "login" : "wrong pw" : "fail";
    }
}