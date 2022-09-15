import java.util.*;
public class KthLargetElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int arr[]= {7,10,4,3,20,15};
		int k=3;
		for(int i:arr)
		{
			if(pq.size()==k)
			{
				pq.poll();
			}
			pq.add(i);
				
		}
		System.out.println(pq.peek());

	}

}
