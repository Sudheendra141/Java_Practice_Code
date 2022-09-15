import java.util.*;

public class LargestSubArrayOfSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,1,1,1,2,3,5};
		int k=5;
		int i=0,j=0,sum=0,maxSumLength=0;
		ArrayList<Integer> al =new ArrayList<>();
		
		while(j<arr.length)
		{
			if(sum<k)
			{
				sum+=arr[j];
			
			}
			if(sum==k)
			{
				maxSumLength=Math.max(maxSumLength, j-i+1);
			System.out.println("i: "+i+" j: "+j);
				sum+=arr[j];
	}
			
			while(sum>k)
			{
				
				sum-=arr[i];
				i++;
			}
	j++;
			}
		
				
		System.out.println(maxSumLength);
			
		}
		

	}


