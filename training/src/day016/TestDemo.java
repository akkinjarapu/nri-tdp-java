package day016;

import java.util.Objects;

public class TestDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student("anbnd", "Kinjarapu");
		Student s2 = new Student("anand", "K");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
		Student s3 = s1.clone();
		System.out.println(s1 == s3);
	}
}


class Student implements Comparable<Student>, Cloneable{
	String fname;
	String lname;
	public Student(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(fname, lname);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(fname, other.fname) && this.lname.charAt(0) == other.lname.charAt(0);
	}

	@Override
	public int compareTo(Student other) {
		return fname.compareTo((other.fname));
	}

	@Override
	protected Student clone() throws CloneNotSupportedException {
		//return (Student) super.clone();
		return this;
	}
	
}