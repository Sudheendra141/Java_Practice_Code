package codingninja;

public class sort1 {



	static void mergeSort(int arr[], int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, end, mid);
	}

	static void merge(int arr[], int start, int end, int mid) {
		int len1 = mid - start + 1;
		int len2 = end - mid;
		int arr1[] = new int[len1];
		int arr2[] = new int[len2];
		for (int i = 0; i < len1; i++)
			arr1[i] = arr[start + i];
		for (int i = 0; i < len2; i++)
			arr2[i] = arr[mid + 1 + i];
		int i = 0, j = 0, k = 0;
		while (i < len1 && j < len2) {
			if (arr1[i] <= arr2[j])
				arr[start + k] = arr1[i++];
			else
				arr[start + k] = arr2[j++];
			k++;
		}
		while (i < len1)
			arr[start + k++] = arr1[i++];
		while (j < len2)
			arr[start + k++] = arr2[j++];

	}

}
