package JuneLongOne2022Division3;

import java.util.*;

public class Subscriptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		Scanner s = new Scanner(System.in);
		t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt(), m = s.nextInt();
			int d = n / 6;
			if (n % 6 != 0) {
				d++;
			}

			t--;
			System.out.println(d * m);
		}

	}

}
