package day030;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsDemo20 {

	public static void main(String[] args) throws Exception, InputMismatchException {
		System.out.println("scanner opened");
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();
		scanner.close();
		System.out.println("scanner closed");
	}

}
