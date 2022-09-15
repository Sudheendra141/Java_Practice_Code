import java.util.*;

public class NextAlphabetElement {

	public static void main(String[] args) {

		char[] arr={'a','c','f','h'};
		
		char c=solve(arr,'c');
		System.out.println(c);
	}
	
	static char solve(char arr[],char c)
	{
		int l=0,h=arr.length-1,mid=l+(h-1)/2;
		char res=' ';
		while(l<=h)
		{
			System.out.println("l: "+l+" h: "+h);
			if(arr[mid]==c)
			{
				res=arr[mid];
				l=mid+1;
				
			}
			else if(arr[mid]<c)
			{
				l=mid+1;
			}
			else
			{
				h=mid-1;
			}
			mid=l+(h-1)/2;
		}
		return arr[l];
	}

}
