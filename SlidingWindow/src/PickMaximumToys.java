import java.util.*;
class Toy
{
	String name;
	int val;
	Toy(String name,int val)
	{
		this.name=name;
		this.val=val;
	}
}
public class PickMaximumToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner s=new Scanner(System.in);
		
		//Toy arr[]=new Toy[] {new Toy("A",200),new Toy("A",200),new Toy("B",123),new Toy("B",123),new Toy("c",400)};
		String arr[]= {"a","b","a","a","c","c","a","b"};
		int n=arr.length;
		int i=0,j=0;
		int ans=0;
		int ind=-1;
		HashMap<String,Integer> hm = new HashMap<>();
			while(j<n)
		{
				System.out.println("jndn");
				if(hm.containsKey(arr[j]))
				{
					int x=hm.get(arr[j]);
					hm.put(arr[j],++x);
				}else
				hm.put(arr[j],1);
				
				if(hm.size()>2)
				{
					while(hm.size()>2)
					{
						
						String temp=arr[i];
						int x=hm.get(temp);
						hm.put(temp, --x);
						if(hm.get(temp)==0)
						{
							hm.remove(temp);
						}
						i++;
					}
				
					j++;
				}
				else if(hm.size()==2)
				{
					
				if((j-i+1)>ans)
				{
					ans=j-i+1;
					ind=i;
				}
					j++;
					
				}
				else
				{
					j++;
				}
				
		}
			System.out.println("idn");
			System.out.println(ans);
			
				while(ind<(ind+ans))
				{
					System.out.println(arr[ind]);
					ind++;
				}

	}

}
