package day033;

import java.util.Arrays;

public class LCSDPDemo04 {

	public static void main(String[] args) {
//		String first = "XMJYAUZ";
//		String second = "MZJAWXU";
		
		String first = "ABCBDAB";
		String second = "BDCABA";
		
//		String first = "ABCBDAB";
//		String second = "FGFHKHG";
		
		int[][] dp = lcs(first, second);
		for(int[] row : dp)
			System.out.println(Arrays.toString(row));
		
		String seq = lcs(first, second, dp);
		System.out.println(seq);
	}

	private static String lcs(String first, String second, int[][] dp) {
		int len1 = dp.length - 1;
		int len2 = dp[0].length - 1;
		StringBuilder sb = new StringBuilder(dp[len1][len2]);
		
		int i = len1, j = len2;
		
		while(i > 0 && j > 0) {
			if(first.charAt(i - 1) == second.charAt(j - 1)) {
				sb.insert(0, first.charAt(i - 1));
				i--; j--;
			} else {
				if(dp[i - 1][j] > dp[i][j - 1])
					i--;
				else
					j--;
			}
		}
		
		return sb.toString();
	}

	private static int[][] lcs(String first, String second) {
		int len1 = first.length();
		int len2 = second.length();
		
		int[][] dp = new int[len1 + 1][len2 + 1];
		
		for(int i = 0; i <= len1; i++) {
			for(int j = 0; j <= len2; j++) {
				if(i == 0 || j == 0)
					dp[i][j] = 0;
				else if(first.charAt(i - 1) == second.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Integer.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		
		
		return dp;
	}

}
