package day032;

public class ExceptionsDemo09 {

	public static void main(String[] args) {
		try {
			int len = 10;
			String name = "NRI TDP";
			
			if(name.length() != len)
				throw new ExceptionsWithArguments(len, name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
