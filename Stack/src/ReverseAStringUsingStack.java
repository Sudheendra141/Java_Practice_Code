
public class ReverseAStringUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="zbc";
		
		Stack<Character> st=new Stack<>();
		
		for(char c:str.toCharArray())
		{
			st.push(c);
		}
		String fin="";
		int n=st.size();
		while(n!=0)
		{
			fin+=st.pop();
			n--;
		}
		System.out.println(fin);;;;

	}

}
