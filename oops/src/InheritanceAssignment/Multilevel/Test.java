package InheritanceAssignment.Multilevel;

public class Test {
	public static void main(String[] args) {

		GrandFather grandFather = new GrandFather();
		System.out.println("Grand father property : " + grandFather.grandProperty);
		grandFather.grandFatherSkills();
		System.out.println();

		Father father = new Father();
		System.out.println("father property : " + father.property);
		System.out.println("grand father property : " + father.grandProperty);
		father.fatherSkills();
		father.grandFatherSkills();
		System.out.println();

		Son son = new Son();
		System.out.println("son property : " + son.sonProperty);
		System.out.println("father property : " + father.property);
		System.out.println("Grandd father property : " + son.grandProperty);
		son.sonSkills();
		son.fatherSkills();
		son.grandFatherSkills();
	}

}
