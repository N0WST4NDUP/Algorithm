package test.java.KAKAO_WINTER_INTERNSHIP_2024.Lv2.도넛과_막대_그래프;

import java.util.*;

public class Solution {
	Map<String, Integer> edgesMap = new HashMap<>();
	
	public int[] solution(int[][] edges) {
		int[] answer = new int[6];
		
        return answer;
    }
	
    
//###########################################################################
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	int[][] edges = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
    	
    	int[] a = s.solution(edges);
    	
    	printArr(a);
    }
    
    public static void printArr(List arr) {
    	for (Object o : arr) {
    		System.out.println(o.toString());
    	}
    }
    
    public static void printArr(Object[] arr) {
    	for (Object o : arr) {
    		System.out.println(o.toString());
    	}
    }
    
    public static void printArr(int[] arr) {
    	for (int i : arr) {
    		System.out.println(i);
    	}
    }
}