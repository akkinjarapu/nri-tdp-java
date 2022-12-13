package day033;

import java.util.Arrays;

public class LCSDPDemo03 {

	public static void main(String[] args) {
//		String first = "XMJYAUZ";
//		String second = "MZJAWXU";
		
		String first = "ABCBDAB";
		String second = "BDCABA";
		
//		String first = "ABCBDAB";
//		String second = "FGFHKHG";
		
		System.out.println(lcs(first, second));
	}

	private static int lcs(String first, String second) {
		int len1 = first.length();
		int len2 = second.length();
		
		if(len1 < len2) {
			String temp = first;
			first = second;
			second = temp;
			
			int t = len1;
			len1 = len2;
			len2 = t;
		}
		
		int[][] dp = new int[2][len2 + 1];
		int bi = 0;
		
		for(int i = 0; i <= len1; i++) {
			bi = i & 1;
			
			for(int j = 0; j <= len2; j++) {
				if(i == 0 || j == 0)
					dp[bi][j] = 0;
				else if(first.charAt(i - 1) == second.charAt(j - 1))
					dp[bi][j] = dp[1 - bi][j - 1] + 1;
				else
					dp[bi][j] = Integer.max(dp[1 - bi][j], dp[bi][j - 1]);
			}
		}
		
		for(int[] row : dp)
			System.out.println(Arrays.toString(row));
		return dp[bi][len2];
	}

}
