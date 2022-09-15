
public class SelectionSort {

	public static void main(String[] args) {
			int arr[]= {8,4,1,5,9,2};
			int i=1;
			while(i<arr.length)
			{
				int j=i;
				int temp=arr[j];
				while(j>=1 && arr[j-1]>temp)
				{
					arr[j]=arr[j-1];
					j--;
					
				}
				arr[j]=temp;
				
				i++;
				
			}
			
			for(i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}

	}

}
