package day033;

import static java.util.stream.Collectors.toSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class LCSDPDemo10 {

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
		
		Set<String> seq = lcs(first, second, dp);
		System.out.println(seq);
	}
	
	private static Set<String> lcs(String first, String second, int[][] dp) {
		return lcs(first, second, dp, dp.length - 1, dp[0].length - 1).stream()
								.map(StringBuilder::toString)
								.collect(toSet());
	}

	private static List<StringBuilder> lcs(String first, String second, int[][] dp, int i, int j) {
		if (i == 0 || j == 0)
			return new ArrayList<>(Collections.nCopies(1, new StringBuilder()));
		
		
		if(first.charAt(i - 1) == second.charAt(j - 1)) {
			List<StringBuilder> all = lcs(first, second, dp, i - 1, j - 1);
			for(StringBuilder sb : all)
				sb.append(first.charAt(i - 1));
			return all;
		}
		
		if(dp[i - 1][j] > dp[i][j - 1])
			return lcs(first, second, dp, i - 1, j);
					
		if(dp[i - 1][j] < dp[i][j - 1])
			return lcs(first, second, dp, i, j - 1);
		
		List<StringBuilder> merged = lcs(first, second, dp, i, j - 1);
		merged.addAll(lcs(first, second, dp, i - 1, j));
		return merged;
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
