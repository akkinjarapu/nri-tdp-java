package day025;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class FPDemo06 {
	public static void main(String[] args) {
		IntPredicate predicate = (t) -> (t & 1) == 0;
		System.out.println(predicate.test(10));
		
		BiFunction<Integer, String, Student> biFunction = Student::new; // constructor reference
		System.out.println(biFunction.apply(101, "Degree"));
		
		Predicate<Student> predicate2 = Student::isGraduate;
		System.out.println(predicate2.test(new Student(101, "Degree")));
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(biFunction.apply(102, "SSC") );
		students.add(biFunction.apply(101, "Degree") );
		students.add(biFunction.apply(103, "BIE") );
		
		students.sort((a1, a2) -> a2.compareTo(a1));
		System.out.println(students);
		
		students.sort(comparing(Student::getRegno));
		System.out.println(students);
	}

}

class Student implements Comparable<Student> {
	private int regno;
	private String qualification;
	
	public Student(int regno, String qualification) {
		super();
		this.regno = regno;
		this.qualification = qualification;
	}

	public int getRegno() {
		return regno;
	}

	@Override
	public String toString() {
		return regno + "=" + qualification;
	}
	
	public boolean isGraduate( ) {
		return "Degree".equals(qualification);
	}

	@Override
	public int compareTo(Student o) {
		return this.regno - o.regno;
	}
}
