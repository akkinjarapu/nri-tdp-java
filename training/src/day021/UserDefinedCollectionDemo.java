package day021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class UserDefinedCollectionDemo {

	public static void main(String[] args) {
	
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(2, "Sai Krishna"));
		students.add(new Student(1, "Ayesha"));
		students.add(new Student(3, "Bhanu Prasad"));
		
		System.out.println(students);
		
//		Student student = new Student(1, "Ayesha");
//		if (!students.contains(student)) {
//			students.add(student);
//		}

//		students.sort(null);
		students.sort(new StudentComparator());
		System.out.println(students);
		
		Collections.sort(students);
		System.out.println(students);
		
//		for(Student s : students) {
//			System.out.println(s);
//		}
		
//		System.out.println(students.get(0) == students.get(2));
//		System.out.println(students.get(0).equals(students.get(2)));
	}
	
}

class Student implements Comparable<Student> {
	private Integer regno;
	private String name;
	
	public Student(Integer regno, String name) {
		this.regno = regno;
		this.name = name;
	}

	public Student(String name, Integer regno) {
		this(regno, name);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return regno + "=" + name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, regno);
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
//		return Objects.equals(regno, other.regno);
		return Objects.equals(name, other.name) && Objects.equals(regno, other.regno);
//		return name.equalsIgnoreCase(other.name) && Objects.equals(regno, other.regno);
	}

	@Override
	public int compareTo(Student other) {
		return this.regno.compareTo(other.regno);
	}
	
}


class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s1.getName().compareTo(s2.getName());
	}
	
}

