import java.util.*;
public class StudentImplementation {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		
		al.add(new Student("Ramu",30));
		al.add(new Student("Raju",90));
		al.add(new Student("Kamal",34.89));
		al.add(new Student("Rohit",90));
		
		Collections.sort(al);
		al.forEach(System.out::println);

	}

}
