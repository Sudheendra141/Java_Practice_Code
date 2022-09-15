package codingninja;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,4,67,12,0,1,45,98,8763};
		Arrays.stream(arr).forEach((a)->{System.out.print(a+" , ");});
		sort1.mergeSort(arr, 0, arr.length-1);
		System.out.println();
		Arrays.stream(arr).forEach((a)->{System.out.print(a+" , ");});


	}

}
