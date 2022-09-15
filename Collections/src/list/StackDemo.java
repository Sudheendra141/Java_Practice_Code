package list;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		List al;

		Stack<String> st=new Stack<>();
		
		//push
			st.push("Sudheendra");
			st.push("Sudheendra");
			st.push("Ragh");
		//peek
			String topElement=st.peek();

			st.add("moomd");
			st.add("mfoof");
			String ams=st.remove(4);
			System.out.println("-"+ams);
		//pop
			st.pop();
		
		st.add("moo");
		Iterator<String> i=st.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
		

	}

}
