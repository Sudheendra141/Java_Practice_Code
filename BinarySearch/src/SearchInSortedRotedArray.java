
public class SearchInSortedRotedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 9, 10, 12, 3 };
		int k = 3;
		int pivot = getPivot(arr);
		int l = 0, h = arr.length;
System.out.println("pivot : "+pivot);
		if (pivot != -1) {

			if (k >= arr[0] && k <= arr[pivot]) {
				System.out.println(solve(arr, k, 0, k));
			} else {
				System.out.println(solve(arr, k, k + 1, h));
			}

		}

	}

	static int solve(int arr[], int k, int l, int h) {
		int mid = l + (h - l) / 2;
		while (l <= h) {
			//System.out.println("low:" + l + "high" + h + "mid" + mid);
			if (arr[mid] == k)
				return mid;
			else if (k < arr[0]) {
				l = mid + 1;
			} else {
				h = mid - 1;
			}
			mid = l + (h - l) / 2;
		}
		
		return -1;
	}

	static int getPivot(int arr[]) {
		int l = 0, h = arr.length - 1, mid = l + (h - 1) / 2;
	
		while (l <= h) {
			System.out.println(l+" "+mid+" "+h);
			 if (arr[mid] >= arr[0]) {
				l = mid +1;
			} else {
				h = mid - 1;
			}
			mid=(l+h)/2;
		}
		System.out.println("low:" + l + "high" + h + "mid" + mid);

		return h;
	}

}
