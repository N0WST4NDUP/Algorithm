class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase(); // 1
		new_id = new_id.replaceAll("[^\\w\\-_.]*", ""); // 2
        new_id = new_id.replaceAll("\\.{2,}", "."); // 3
        new_id = new_id.replaceAll("^[.]|[.]$", ""); // 4
		if (new_id.length() == 0) new_id += "a"; // 5
		if (new_id.length() > 15) new_id = new_id.substring(0, 15).replaceAll("^[.]|[.]$", ""); // 6
		if (new_id.length()<=2) while (new_id.length()<3) new_id += new_id.charAt(new_id.length()-1); // 7
        return new_id;
    }
}