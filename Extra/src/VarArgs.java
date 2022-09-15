
public class VarArgs {

	public static void main(String[] args) {

		int arr[]= {1,5,67,0};
		int brr[]= {6,34,56};
		System.out.println(add(arr));
	}
	
	static int add(int ... args)
	{
		int ans=0;
		for(int i=0;i<args.length;i++)
		{
			ans+=args[i];
		}
		return ans;
	}

}
