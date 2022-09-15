//import java.util.*;

public class Student implements Comparable<Student> {
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	private String name;
	private double marks;

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	public int compareTo(Student st)
	{
		return (int) (st.getMarks()-this.getMarks());
	}

}
