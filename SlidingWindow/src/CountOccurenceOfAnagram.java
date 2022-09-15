import java.util.*;

public class CountOccurenceOfAnagram {

	public static void main(String[] args) {

		String str = "aabaabaa";
		String pat = "aaba";
		String arr[] = solve(str, pat);
		for (String x : arr) {
			System.out.println(x);
		}
	}

	static String[] solve(String str, String pat) {
		ArrayList<String> al = new ArrayList<>();
		int i = 0, j = 0, k = pat.length();
		HashMap<Character, Integer> hm1 = new HashMap<>();
		HashMap<Character, Integer> hm2 = new HashMap<>();

		while (j < str.length()) {
			if (j < k) {

				fillHash(str, hm1, j);
				fillHash2(pat, hm2, j);
				j++;

			} else {

				// System.out.println(" j :"+j+"hm1: "+hm1);
				if (isEqual(hm1, hm2)) {
					al.add(str.substring(i, i + k));
				}
				int c = hm1.get(str.charAt(i));
				c--;
				if (c > 0)
					hm1.put(str.charAt(i), c);
				else
					hm1.remove(str.charAt(i));

				fillHash(str, hm1, j);

				i++;
				j++;

			}

		}
		if (isEqual(hm1, hm2)) {
			al.add(str.substring(i, i + k));
		}

		return al.toArray(new String[al.size()]);
	}

	static boolean isEqual(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2) {
		Iterator it = hm1.entrySet().iterator();
		Iterator it2 = hm2.entrySet().iterator();
		while (it2.hasNext()) {
			Map.Entry pair = (Map.Entry) it2.next();
			Character c = (Character) pair.getKey();
			Integer val = (Integer) pair.getValue();
			if (hm1.containsKey(c)) {
				if (!(hm1.get(c) == val)) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	static void fillHash(String str, HashMap<Character, Integer> hm1, int index) {
		char c = str.charAt(index);
		if (hm1.containsKey(c)) {
			int v = hm1.get(c);
			hm1.put(c, ++v);
		} else {
			hm1.put(c, 1);
		}
	}

	static void fillHash2(String pat, HashMap<Character, Integer> hm2, int index) {
		char c = pat.charAt(index);
		if (hm2.containsKey(c)) {
			int v = hm2.get(c);
			hm2.put(c, ++v);
		} else {
			hm2.put(c, 1);
		}
	}

}
