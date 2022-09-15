package problemsOnString;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String arr[]=str.split(" ");
		
		int max=0;
		for(int i=0;i<arr.length;i++)
		{int sum=0;
			char temp[]=arr[i].toCharArray();
			Arrays.sort(temp);
		for(int j=0;j<temp.length;j++)
		{
			sum+=(j+1)*(temp[j]-'a'+1);
		}
		max=Math.max(sum, max);
		}
		System.out.println(max);

	}

}
