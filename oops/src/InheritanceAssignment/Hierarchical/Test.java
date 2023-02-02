package InheritanceAssignment.Hierarchical;

public class Test {
	public static void main(String[] args) {
		Daughter daughter = new Daughter();

		daughter.daughterProperty = "Bike";
		daughter.property = "House";
		
		System.out.println("Daughter property : " + daughter.daughterProperty);
		daughter.daughterSkills();
		System.out.println();

		System.out.println("Father property : " + daughter.property);
		daughter.fatherSkills();
		
		System.out.println();
		
		Son son=new Son();
		son.sonProperty = "Car";
		son.property = "Farm House";
		
		System.out.println("son property : " + son.sonProperty);
		son.sonSkills();
		System.out.println();

		System.out.println("Father property : " + son.property);
		son.fatherSkills();
		
		
	
	}

}
