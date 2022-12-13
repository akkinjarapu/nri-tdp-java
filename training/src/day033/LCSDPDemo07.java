package day033;

import java.util.Arrays;

public class LCSDPDemo07 {

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
		
		String seq = lcs(first, second, dp).toString();
		System.out.println(seq);
	}
	
	private static StringBuilder lcs(String first, String second, int[][] dp) {
		return lcs(first, second, dp, dp.length - 1, dp[0].length - 1);
	}

	private static StringBuilder lcs(String first, String second, int[][] dp, int i, int j) {
		if (i == 0 || j == 0)
			return new StringBuilder();
		
		if(first.charAt(i - 1) == second.charAt(j - 1))
			return lcs(first, second, dp, i - 1, j - 1).append(first.charAt(i - 1));
		
		if(dp[i - 1][j] > dp[i][j - 1])
			return lcs(first, second, dp, i - 1, j);
					
		return lcs(first, second, dp, i, j - 1);
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
