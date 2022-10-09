package customsort.demo;

import java.util.*;

//	sort using int compareTo(ob) method

public class TestStud {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Parth");
		Student s2 = new Student(4, "Chaitnya");
		Student s3 = new Student(3, "Madhav");
		
		
		TreeSet<Student> stud = new TreeSet<Student>();
		
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);	
		
		System.out.println(stud);
	}	
}
