import java.util.*;
public class PivotElementInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,9,10,12,13,14,15,1};
		int n=solve(arr);
		System.out.println(n);

	}
	static int solve(int arr[])
	{
		int l=0,h=arr.length-1;
		int mid=-1;
		while(l<h)
		{
			 mid=(l+h)/2;
			System.out.println("low:"+l+"high"+h+"mid"+mid);

			
			if(arr[mid]>=arr[0])
			{
				l=mid+1;
			}
			else
			{
				h=mid;
			}
		}
		System.out.println("low:"+l+"high"+h+"mid"+mid);

		return h;
	}

}
