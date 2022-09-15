import java.util.*;
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(1,23,3));
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			int a=it.next();
			System.out.println(a);
			
			for(int x:al)
			{
				System.out.println(x);
			}
		}

	}

}
