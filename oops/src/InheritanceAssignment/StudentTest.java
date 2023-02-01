package InheritanceAssignment;

public class StudentTest {

	public static void main(String[] args) {
		ScienceStudent scienceStudent = new ScienceStudent();

		scienceStudent.name = "Swara";
		scienceStudent.practicalSubject = "Chemistry";
		scienceStudent.stream = "Science";
		scienceStudent.year = 2022;
		scienceStudent.display();
		scienceStudent.collegeName();
		System.out.println(scienceStudent);

		CommerceStudent commerceStudent = new CommerceStudent();
		commerceStudent.name = "Aarav";
		commerceStudent.stream = "Commerce";
		commerceStudent.year = 2020;
		commerceStudent.mainSubject = "Accountancy";
		System.out.println(commerceStudent);

//		commerceStudent.display();
		commerceStudent.commerceMethod();
	}

}
