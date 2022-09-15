import java.util.Arrays;

public class mergeSortMain {
	
	static void merge(int arr[],int s,int e)
	{
		int mid=(s+e)/2;
		int len1=mid-s+1;
		int len2=e-mid;
		int arr1[]=new int[len1];
		int arr2[]=new int[len2];
		System.out.println("len1: "+len1+" len2: "+len2);
		int i=s;
		for(int j=0;j<len1;j++)
		{
			arr1[j]=arr[i++];
			System.out.println("i: "+i+" j: "+j);
		}
		i--;
		for(int j=0;j<len2;j++)
		{
			arr2[j]=arr[i++];
		}
		i=0;int j=0,k=s;
		while(i<len1 && j<len2)
		{
			if(arr1[i]<arr2[j])
			{
				arr[k]=arr1[i];
				i++;
			}
			else
			{
				arr[k]=arr[j];
				j++;
			}
			k++;
		}
		while(i<len1)
		{
			arr1[i++]=arr[k++];
		}
		while(j<len2 )
		{
			arr2[j++]=arr[k++];
		}
		
	}
	static void mergeSort(int arr[],int s,int e)
	{
		if(s>=e)
			return ;
		int mid=(s+e)/2;
		mergeSort(arr,s,mid);
		mergeSort(arr,mid+1,e);
		merge(arr,s,e);
	}
	public static void main(String[] args) {
		int arr[]= {3,1,2,3,12,-1};
		mergeSort(arr,0,arr.length);
	String str=	Arrays.toString(arr);
	System.out.println(str);
		
	}
}
