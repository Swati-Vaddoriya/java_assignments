package EncapulationAssignment;

public class HumanBeing {
	private String name;
	private int age;
	private float height;
	private boolean isFemale;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		String regex = "([A-Z][A-Za-z]+ )+{2,30}";
		if (name.matches(regex)) {
			this.name = name;
		}
		System.out.println("Please enter valid name");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 0) {
			System.out.println("Please enter valid age");
		} else {
			this.age = age;
		}
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
		if (height <= 1.5) {
			System.out.println("Please enter valid height");
		} else {
			this.height = height;
		}
	}

	public boolean getisFemale() {
		return isFemale;
	}

	public void setisFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}
}
