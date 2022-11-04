package day008;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Prog002 {

	public static void main(String[] args) throws IOException {
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 100;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < a.length; i++) {
//			a[i] = System.in.read();
//			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println(Arrays.toString(a));
	}

}
