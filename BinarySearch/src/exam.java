
public class exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,18,20};
	int ans=	solve(arr,1,20,400);
	System.out.println(ans);
	}
	static int solve(int arr[],int l,int h,int pre)
	{
		
		
		while(l<=h)
		{
			int mid=l+(h-l)/2;
			
			int a=help(mid,arr);
			int b=help(mid+1,arr);
			int c=help(mid-1,arr);
			
			if(b>=c && c<=a)
			{
			return help(mid,arr);
			}
			else if(help(mid+1,arr)>help(mid,arr))
			{
			h=mid-1;
			}
			else l=mid+1;
		
		}
		return -1;
		
	}
	
static int help(int mid,int arr[])
{
	int ans=0;
	for(int i=0;i<arr.length;i++)
	{
		ans+=Math.abs(mid-arr[i]);
	}
	return ans;
}
}
