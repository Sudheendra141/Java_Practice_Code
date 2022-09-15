package problemsOnString;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Raaaaamu is good boy";
		//Rm s gd by


		String ans=solve(str);
		System.out.println(ans);
				
	}
	static String solve(String temp)
	{
		StringBuilder str=new StringBuilder(temp);
		for(int i=0;i<str.length();i++)
		{
			if(isVowel(str.charAt(i)))
			{
				str.deleteCharAt(i);
				i=i-1; 
			}
		}
		return str.toString();
	}
	static boolean isVowel(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			return true;
		}
		return false;
	}

	
}
