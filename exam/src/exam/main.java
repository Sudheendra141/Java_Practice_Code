package exam;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		int[] arr= {10,41,18,50,43,31,29,25,59,96,67};
		System.out.println( solve(arr));
	
	
		
	}
	static int solve(int arr[])
	{
		int sum=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
			{
				sum+=arr[i];
				min=Math.min(min,arr[i]);
			}
			
		}
		if(sum==0)
		{
			for(int i=0;i<arr.length;i++)
			{
				sum+=arr[i];
				min=Math.min(min,arr[i]);
				
			}
		}
		return sum-min;
	}
	
	static boolean isPrime(int n)
	{

if(n==0 || n==1)
	return false;
int num=(int)Math.sqrt(n);
for(int i=2;i<=num;i++)
{
	if(n%i==0)
		return false;
}
return true;
		
	}

}
