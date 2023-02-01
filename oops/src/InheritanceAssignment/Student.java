package InheritanceAssignment;

public class Student {
	public String name;
	public String stream;
	public int year;
	
	public void display() {
		toString();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", stream=" + stream + ", year=" + year + "]";
	}

}
