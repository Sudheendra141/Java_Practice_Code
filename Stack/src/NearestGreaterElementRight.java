import  java.util.*;
public class NearestGreaterElementRight {

	public static void main(String[] args) {
		
		int arr[]= {1,3,2,4};
		Stack<Integer> st=new Stack<>();
		ArrayList<Integer> al=new ArrayList<>();
		st.push(arr[arr.length-1]);
	al.add(-1);
		for(int i=arr.length-2;i>=0;i--)
		{
			
			while(st.size()!=0 && arr[i]>st.peek())
			{
				st.pop();
			}
			if(st.size()==0)
			{
				al.add(-1);
				continue;
			}
			else
			{
				al.add(st.peek());
				st.push(arr[i]);
			}
				
			
		}
		al.forEach(System.out::println);
		// TODO Auto-generated method stub

	}

}
