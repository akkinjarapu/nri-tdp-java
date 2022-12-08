package day030;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo21 {

	public static void main(String[] args) {
		System.out.println("scanner opened");
		Scanner scanner = new Scanner(System.in);
		
		try {
			scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("type an integer value");
			scanner.next();
			scanner.nextInt();
		}
		
		scanner.close();
		System.out.println("scanner closed");
	}

}
