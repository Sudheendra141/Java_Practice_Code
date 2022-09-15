import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
	
		Student arr[]= {new Student("ravi",12),new Student("kanna",23.6),new Student("Chinna",17),new Student("munna",12)};
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}

}
