package problemsOnString;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=Integer.toString(582109);
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
			sum+=str.charAt(i)-'0';
		}

		System.out.println(solve(0,str,sum));
	}
	static int solve(int i,String str,int sum)
	{
		
		if(i==str.length())
		{
			
			return 0;
		}
		
		
		return sum+solve(i+1,str,sum-(str.charAt(i)-'0'));
		
	}

}
