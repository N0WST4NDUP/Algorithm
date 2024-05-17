package dynamic_programming;

import java.util.Scanner;
import java.util.Arrays;

public class DP_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 삼각형 높이 : ");
		int n = sc.nextInt();
		int[][] triangle = new int[n][];
		for (int i=0; i<n; i++) {
			System.out.println( (i+1) + "층");
			int[] arr = new int[i+1];
			for (int j=0; j<i+1; j++) {
				arr[j] = sc.nextInt();
			}
			triangle[i] = arr;
		}
		System.out.println(dp(triangle));
		sc.close();
	}
	//in -> [[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
	//out -> 30
	static int dp(int[][] triangle) {
		for (int i=1; i<triangle.length; i++) {
			triangle[i][0] += triangle[i-1][0];
			for (int j=1; j<i; j++) {
				triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
			}
			triangle[i][i] += triangle[i-1][i-1];
		}
		return Arrays.stream(triangle[triangle.length-1]).max().getAsInt();
	}
}
