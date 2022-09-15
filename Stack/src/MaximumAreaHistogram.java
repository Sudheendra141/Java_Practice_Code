import java.util.Arrays;

public class MaximumAreaHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
		int n = arr.length;
		int left[] = new int[n];
		int right[] = new int[n];
		fillLeftArr(left, arr);
		//Arrays.stream(left).forEach(System.out::println);
			fillRightArr(right, arr);
//		int ans = -1;
//		for (int i = 0; i < n; i++) {
//			int width = (right[i] - left[i] - 1) * arr[i];
//			ans = Math.max(ans, width);
//
//		}
		//System.out.println(ans);

	}

	static void fillLeftArr(int left[],int arr[] )
	{
		Stack<Integer> st=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{
			if(st.size()==0)
			{
				left[i]=-1;
				st.push(arr[i]);
			}
			else  if(arr[i]>st.peek())
			{
				left[i]=i-1;
				st.push(arr[i]);
			}
			else if(arr[i]<st.peek())
			{
				int temp=i;
				while(st.size()>0 && st.peek()>arr[i])
				{
					st.pop();
					temp--;
				}
				
				if(st.size()==0)
				{
					left[i]=-1;
					
				}
				else
				{
					left[i]=temp-1;
				}
				st.push(arr[i]);
				
			}
		}
	}
	static void fillRightArr(int right[],int arr[])
	{int n=arr.length;
	Stack<Integer> st=new Stack<>();
		for(int i=n-1;i>=0;i--)
		{
			if(st.size()==0))
			{
			right[i]=-1;
				st.push(arr[i]);
			}
			else if(st.peek()<arr[i])
			{
				st.push(arr[i]);
				right[i]=i+1;
						
			}
			else if(st.peek()>=arr[i])
			{
				int temp=i;
				while(st.size()==0 && st.peek()<arr[i])
				{
					temp+=1;
					st.pop();
				}
			}
		}
	}

}
