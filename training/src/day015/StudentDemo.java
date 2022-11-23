package day015;

import java.util.Random;

public class StudentDemo {

	public static void main(String[] args) {

		Random random = new Random();
		System.out.println(random);
		
		DegreeStudent ds = new DegreeStudent(
				"20K61A0501", "Anusha", "CSE");
		System.out.println(ds);

	}

}


class Student {
	private String regno;
	private String name;
	public Student(String regno, String name) {
		this.regno = regno;
		this.name = name;
	}
	
	public Student(String name) {
		this("", name);
	}
	
	public String disp() {
		return regno + " = " + name;
	}

	@Override
	public String toString() {
		return this.disp();
	}
	
}

class DegreeStudent extends Student {
	private String course;

	public DegreeStudent(String regno, String name, String course) {
		super(regno, name);
		this.course = course;
	}
	
	public String disp() {
		return super.disp() + " # " + course;
	}

	@Override
	public String toString() {
		return this.disp();
	}
}