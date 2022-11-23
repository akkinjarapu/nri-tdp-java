package day014;

public class Recursive2Iterative {
	
	static public int factRec(int num) {
		if (num == 0)
			return 1;
		
		return num * factRec(num - 1);
	}
	
	public static int factIter(int num) {
		int fact = 1;
		
		for(int i = num; i != 0; i--) {
			fact *= i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(Recursive2Iterative.factIter(5));
		System.out.println(Recursive2Iterative.factRec(5));
	}

}
