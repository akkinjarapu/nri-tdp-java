package day009;

import java.util.Arrays;

public class Prog005 {

	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3, 4, 5},
			{4,5,6,7},
			{7,8,9}
		};
		
		int s = 0;
		for(int[] row : matrix)
			s += row.length;
		
		int[] a = new int[s];
		int i = 0;
		for(int[] row : matrix)
			for(int v : row)
				a[i++] = v;
		
		System.out.println(Arrays.toString(a));
	}

}
