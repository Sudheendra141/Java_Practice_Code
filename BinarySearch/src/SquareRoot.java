import java.util.*;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long ans = solve(n);
		int pre = 5;
		// System.out.println("9");
		double fin = increasePricision(n, ans, pre);
		System.out.printf("%.5f", fin);

	}

	static double increasePricision(int n, long ans, int pre) {
		double fact = 1;
		double fin = ans;
		for (int i = 1; i <= pre; i++) {
			fact = fact / 10;

			for (double k = ans; k * k <= n; k = k + fact) {
				// System.out.println("k: "+k+"fact: "+fact);
				fin = k;
			}
		}
		return fin;
	}

	static long solve(int n) {
		long l = 0, h = n, mid = (l + h) / 2;

		while (l <= h) {

			if (mid * mid == n)
				return mid;
			else if (mid * mid > n) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
			mid = (l + h) / 2;

			// System.out.println("high: "+h+" mid: "+mid+" low: "+l);
		}

		// System.out.println("high: "+h+" mid: "+mid+" low: "+l);
		return mid;
	}

}
