import java.util.*;

class item  {
	int weight;
	int cost;
	double val;

	item(int a, int b) {
		this.cost = a;
		this.weight = b;
		this.val = (double) a / b;
	}

	
	

}

public class FractionalKnapScak {

	public static void main(String[] args) {
		/*
		 * Your class should be named Solution. Read input as specified in the question.
		 * Print output as specified in the question. Write your code here
		 */
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(), w = s.nextInt();
		item[] arr = new item[n];
		for (int i = 0; i < n; i++) {
			arr[i] = new item(s.nextInt(), s.nextInt());
		}
		Arrays.stream(arr).forEach((temp)->System.out.println("32   "+temp.val));
		Arrays.sort(arr,new Comparator<item>()
				{
			@Override
			  public int compare(item a,item b)
			    {
				
			        return -(int)(b.val-a.val);
			    }
				});
Arrays.stream(arr).forEach((temp)->System.out.println("41  "+temp.val));
		int curWeight = 0;
		double ans = 0;
		for (int i = 0; i < arr.length; i++) {
            System.out.println("-> "+arr[i].val);
			if ((curWeight + arr[i].weight) <= w) {
				ans += arr[i].cost;
				curWeight += arr[i].weight;
			} else {
				double left = w - curWeight;
				ans += (left / arr[i].weight) * arr[i].cost;
				break;
			}
		}
		System.out.println(String.format("%.6f",ans));
	}

}
