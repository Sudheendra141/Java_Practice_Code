
public class MaximumOfAllSubArrayOfSizeK {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 34, 12, 9, 1 };
		int k = 3;
		int n = arr.length;
		int i = 0;
		int mx = -1;
		int j = 0;
		int tempSum = 0, maxSum = 0;
		while (j < n) {
			tempSum += arr[j];
			if (j < k) {
				j++;
			} else {

			

				tempSum -= arr[i];
				i++;
				j++;
				if (maxSum < tempSum) {
					maxSum = tempSum;
					mx = i;
				}
			}
		}
		System.out.println(maxSum + "," + mx);

	}

}