package day022;

public class SumOfDivisors {

	public static int sum(int num) {
		if (num <= 1)
			return num;

		int sum = 1 + num;

		int a = 2, b = 3;
		while (a <= b) {
			b = num / a;
			if (num % a == 0) {
				sum += a == b ? a : a + b;
			}

			a++;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int num = 25;

		System.out.println(sum(num));
	}

}
