package day035;

record StudentRecord(int regno, String name) {
	public int getRegno() {
		return regno;
	}
};

public class Student {
public static void main(String[] args) {
	StudentRecord record = new StudentRecord(101, "Anand");
	
	System.out.println(record);
	System.out.println(record.regno());
	System.out.println(record.getRegno());
}
}