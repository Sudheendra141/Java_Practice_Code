import java.util.*;
public class NthRootOfAnInteger {

	static double multiply(int n,double m)
	{
		double ans=1;
		for(int i=1;i<=n;i++)
		{
			ans*=m;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		double ans=solve(n,m);
		System.out.println(ans);

	}
	static double solve(int n,int m)
	{
		
		double l=1,h=n,mid=0;
		
		while(h-l > 0.01)
		{
			 mid=(l+h)/2;
			
			if(multiply(m,mid) < n)
			{
				l=mid;
			}
			else
			{
				h=mid;
			}
		}
		
		System.out.println("low: "+l+" mid: "+mid+" high: "+h);
		return mid;
	}
	

}
