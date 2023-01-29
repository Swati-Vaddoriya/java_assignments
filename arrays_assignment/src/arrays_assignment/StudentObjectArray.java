package arrays_assignment;

import java.util.Iterator;

public class StudentObjectArray {
	public static void main(String[] args) {
		Student s1 = new  Student();
		s1.setName("Swara");
		s1.setAge(8);
		Student s2 = new  Student();
		s2.setName("Aarav");
		s2.setAge(13);
		Student s3 = new  Student();
		s3.setName("Amit");
		s3.setAge(30);
		
		Student[] students = {s1,s2,s3};
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
