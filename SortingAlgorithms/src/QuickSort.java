
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,3,56,12,-1,56};
		solve(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)System.out.println("->"+arr[i]);
		
	}
	static int partion(int[] arr,int low,int high)
	{
		
		System.out.println("Low: "+low+" High: "+high);
		int pivot=arr[high];
		int lowIndex=low-1;
		for(int j=low;j<high;j++)
		{
			 if(arr[j]<=pivot)
			{ lowIndex++;
				
				int temp=arr[j];
				arr[j]=arr[lowIndex];
				arr[lowIndex]=temp;
				
			}
		
				
			
		}
	
		int temp=arr[high];
		arr[high]=arr[lowIndex+1];
		arr[lowIndex+1]=temp;
		
		for(int i=0;i<arr.length;i++)System.out.println(arr[i]);

		System.out.print("------------"+lowIndex+1);
		return lowIndex+1;
		
	}
static public void solve(int arr[],int low,int high)
{
	if(low>=high) return;
	int pivot=partion(arr,low,high);
	solve(arr,low,pivot-1);
	solve(arr,pivot+1,high);
}
}
