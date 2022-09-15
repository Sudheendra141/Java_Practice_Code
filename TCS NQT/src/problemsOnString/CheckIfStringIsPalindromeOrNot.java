package problemsOnString;

public class CheckIfStringIsPalindromeOrNot {

	public static void main(String[] args) {

		String str = "ABCDCBA";
		// method-1
		System.out.println(str.equals(new StringBuilder(str).reverse().toString()) ? "Palindrome" : "Not Palindrome");
		//==method -2
		if (solve(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
//
	}

	static boolean solve(String str) {
		StringBuilder sb = new StringBuilder(str);
		int low = 0, high = str.length() - 1;
		while (low < high) {
			if (str.charAt(low++) != str.charAt(high--)) {
				return false;
			}

		}
		return true;
	}

	static void swap(StringBuilder str, int i, int j) {
		String temp = str.substring(j, j + 1);
		str.replace(j, j, str.substring(i, i + 1));

		str.replace(i, i, temp);
	}

}
