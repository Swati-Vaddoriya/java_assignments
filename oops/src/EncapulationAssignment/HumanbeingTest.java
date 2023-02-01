package EncapulationAssignment;

public class HumanbeingTest {

	public static void main(String[] args) {
		HumanBeing being = new HumanBeing();
		being.setAge(15);
		being.setHeight(4.0f);
		being.setisFemale(false);
		being.setName("14587azjmn");

		System.out.println("Name : " + being.getName());
		System.out.println("Age : " + being.getAge());
		System.out.println("Height in feet : " + being.getHeight());
		System.out.print("Gender : ");
		System.out.print(being.getisFemale() ? "Female" : "Male");
	}

}
