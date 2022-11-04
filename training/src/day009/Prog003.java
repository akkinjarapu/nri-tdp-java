package day009;

import java.util.Arrays;

public class Prog003 {

	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3, 4, 5},
			{4,5,6,7},
			{7,8,9}
		};
		
		for(int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
	}

}
