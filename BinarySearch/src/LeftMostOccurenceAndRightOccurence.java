public class LeftMostOccurenceAndRightOccurence {

	public static void main(String[] args) {

		int arr[] = { 3, 3, 3, 3,3,3,3,3, 5 };
		int key = 3;
		System.out.println(firstOcc(arr, key) + "," + lastOcc(arr, key));

	}

	static int firstOcc(int arr[], int k) {
		int start = 0, end = arr.length - 1, ans = -1, mid;

		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == k) {
				ans = mid;
				end = mid - 1;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

	static int lastOcc(int arr[], int k) {
		int start = 0, end = arr.length - 1, ans = -1, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (arr[mid] == k) {
				ans = mid;
				start = mid + 1;
			} else if (arr[mid] > k) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}

}
