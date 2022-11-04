package day009;

public class Prog009 {

	public static void main(String[] args) {
		String str1 = "TDP";
		String str2 = "TDP";
		String str3 = new String("TDP");
		String str4 = "" + "TDP";
		String str5 = "TD" + "P";
		String str6 = "TD";
		str6 += "P";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str1 == str5);
		System.out.println(str1 == str6);
		
		str6 = str6.intern();
		System.out.println(str1 == str6);
	}

}
