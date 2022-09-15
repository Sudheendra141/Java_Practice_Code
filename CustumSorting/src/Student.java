
public class Student implements Comparable<Student> {

	private String name;
	private double marks;

	@Override
	public String toString() {
		return "Student [Name: " + getName() + ", Marks: " + getMarks() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, double marks) {

		this.name = name;
		this.marks = marks;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student st) {
		return (int) (this.getMarks() - st.getMarks());
	}
}
