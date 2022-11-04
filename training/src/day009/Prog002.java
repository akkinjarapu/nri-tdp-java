package day009;

import java.util.Arrays;

public class Prog002 {

	public static void main(String[] args) {
		int[][] matrix = {
			{1,2,3, 4, 5},
			{4,5,6,7},
			{7,8,9}
		};
		
		System.out.println(matrix[1][2]);
		
		System.out.println(matrix);
		
		System.out.println(matrix[1]);
		
		System.out.println(Arrays.toString(matrix[1]));
		
		System.out.println(Arrays.toString(matrix));
		
		System.out.println(Arrays.deepToString(matrix));
	}

}
