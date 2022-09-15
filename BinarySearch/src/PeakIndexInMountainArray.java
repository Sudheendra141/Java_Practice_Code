
public class PeakIndexInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 7, 8 };
		int n = solve(arr);
		System.out.println(n);

	}

	static int solve(int arr[]) {
		int l = 0, h = arr.length - 1;
		int mid = (l + h) / 2;

		while (l < h) {
			System.out.println("low " + l + " high " + h + " mid " + mid);

			if ((arr[mid - 1] < arr[mid]) && (arr[mid] > arr[mid + 1])) {
				return mid;
			} else if (arr[mid] > arr[mid + 1]) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
			mid = (l + h) / 2;
		}
		return mid;
	}

}
