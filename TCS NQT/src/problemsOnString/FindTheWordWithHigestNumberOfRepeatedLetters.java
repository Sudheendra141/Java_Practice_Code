package problemsOnString;

import java.util.*;

public class FindTheWordWithHigestNumberOfRepeatedLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabaaabdniwieinwwww aaknskeiooooooopqopwoppppqqqqqq ";

		String output = solve(new StringBuilder(str.toLowerCase()));

		System.out.println(output);

	}

	static String solve(StringBuilder str) {
		int max = 0, maxIndex = 0, maxEndIndex = 0;
		int arr[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int temp = i;
			int sum = 0;
			while (i < str.length()) {
			
				char c = str.charAt(i);
				if (c == ' ') {
					for (int k = 0; k < arr.length; k++) {
						if (arr[k] > 1) {
							sum += arr[k];
						}

					}
					if (sum > max) {
						max = sum;
						maxIndex = temp;
						maxEndIndex = i;

					}

					break;
				}
				arr[c - 97]++;

				i++;
			}

		
			Arrays.fill(arr, 0);
		}
		if (maxIndex == maxEndIndex)
			return "-1";
		return str.substring(maxIndex, maxEndIndex);
	}

}
