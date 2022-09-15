package problemsOnString;

public class CountNumberOfVowelsConsonantsSpacesInString {

	public static void main(String[] args) {
		String str = " Ramu is Good Boy . ";
		StringBuilder sb=new StringBuilder(str);
		//Vowels : 6 Consonents: 4 Spaces: 6


		int vowel=0,consonents=0,spaces=0;
		
		for(int i=0;i<sb.length();i++)
		{
			if(isVowel(sb.charAt(i)))
			{
				vowel+=1;
			}
			else if(sb.charAt(i)>=97 && sb.charAt(i)<=122)
			{
				consonents++;
			}
			else if(sb.charAt(i)==' ')
			{
				spaces++;
			}
		}
		System.out.println("Vowels : "+vowel+"Consonents: "+consonents+"Spaces: "+spaces);
		
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
