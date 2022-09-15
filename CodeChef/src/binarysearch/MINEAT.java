package binarysearch;

import java.util.*;
import java.util.stream.IntStream;

public class MINEAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t-- != 0) {
			int n = s.nextInt(), h = s.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
			// System.out.println(calc(0,n,3,arr));

			int ans = solve(1, h, h, arr);
			System.out.println(ans);
		}

	}

	static int solve(int low, int high, int maxhours, int[] arr) {
		if (low > high) {
			// System.out.println("if");
			return -1;
		}
		int mid = (low + high) / 2;
		int rem = calc(arr, mid, maxhours);
		// System.out.println("rem :"+ rem+"mid: "+mid+"low: "+low+"high "+high);
		if (rem == 0) {
			return mid;
		}

		if (rem > 0) {
			return solve(low, mid - 1, maxhours, arr);
		}
		return solve(mid + 1, high, maxhours, arr);
	}

	static int calc(int arr[], int mid, int maxhours) {
		int rem = maxhours;
		for (int i = 0; i < arr.length; i++) {
			int temp=(int)Math.ceil(arr[i]/(double)mid);
			rem-=temp;

		}

		return rem;
	}

}
