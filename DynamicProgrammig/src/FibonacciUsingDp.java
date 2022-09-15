import java.util.*;



public class FibonacciUsingDp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] arr = new long[n + 1]; // step-1:Declaring Array(considering size)
		Arrays.fill(arr, -1);
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(solve(n, arr));
		System.out.println(solve2(n));
		System.out.println(solve3(n));

	}

	private static long solve2(int n) { // tabulation [tc=O(n),sc=O(n)]

		long[] arr = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}

		return arr[n];
	}

	static long solve(int n, long arr[]) { // memoization t.c:O(n) s.p:O(n+n)

		if (arr[n] == -1) {
			arr[n] = solve(n - 1, arr) + solve(n - 2, arr);
			return arr[n];
		}

		return arr[n];
	}

	private static long solve3(int n) { // Space Optimisation t.c=O(n) sp=O(1);

		long a = 0, b = 1, c = 1;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return c;
	}
}
