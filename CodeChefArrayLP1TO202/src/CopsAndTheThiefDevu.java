import java.util.*;
public class CopsAndTheThiefDevu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0)
		{
			int m=s.nextInt(),x=s.nextInt(),y=s.nextInt();
			int arr[]=new int[m];
			for(int i=0;i<m;i++)
			{
				arr[i]=s.nextInt();
			}
			// input complted
			int range=x*y;
			
			int police[]=new int[101];
			for(int i=0;i<m;i++)
			{
				int left=arr[i];
				int right=arr[i];
				int ind=1;
				while(left>=1 && ind<=range+1)
				{
					police[left--]=1;
					ind++;
				}
				ind=1;
				while(right<=100 && ind<=range+1)
				{
					police[right++]=1;
					
					ind++;
				}
			}
			int c=0;
			for(int i=1;i<=100;i++)
			{
				if(police[i]==0)
				{
					c++;
					System.out.println(i);
				}
			}
			System.out.println("c: "+c);
		}

	}

}
