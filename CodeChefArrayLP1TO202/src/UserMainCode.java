
public class UserMainCode {

	public static int solve(String input1)
	{
		
		
		if(checkExtra(input1.toLowerCase()))
		{
			return 1;
			
		}
		return input1.charAt(0)+input1.charAt(input1.length()-1);

	}
	static boolean checkExtra(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)>=97 &&str.charAt(i)<=122))
				return true;
				
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(solve("aa"));	

	}

}
