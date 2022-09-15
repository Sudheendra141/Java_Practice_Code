import java.util.*;

public class NobelPrize {

	public static void main(String[] args) {
		int t;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		while (t > 0) {
			int n=s.nextInt(),m=s.nextInt();
		int arr[]=new int [n];
		boolean[] check=new boolean[m+1];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			check[arr[i]]=true;
			
			
		}
		String eligible="No";
		for(int i=1;i<=m;i++)
		{
			if(check[i]==false)
			{
				eligible="yes";
			}
		}
		System.out.println(eligible);

			t--;
			
		}
	}

}
