import java.util.*;

public class CeilingOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 40, 56, 90, 100, 120, 136 };
		System.out.println(solve(arr, 0, arr.length - 1, 180));

	}

	static int solve(int[] arr, int low, int high, int k) {
		if (arr[arr.length - 1] < k) {
			return -1;
		}

		if (low > high) {
			return arr[low];
		}
		int mid = (low + high) / 2;
		if (arr[mid] == k)
			return arr[mid];
		else if (arr[mid] < k) {
			return solve(arr, mid + 1, high, k);
		}
		return solve(arr, low, mid - 1, k);

	}

}
