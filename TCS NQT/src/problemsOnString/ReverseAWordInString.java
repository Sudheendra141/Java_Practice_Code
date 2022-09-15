package problemsOnString;

public class ReverseAWordInString {

	public static void main(String[] args) {

		String str = "   Ramu Is Good Boy   ";// umaR si dooG yoB

		String ans = solve(new StringBuilder(str));
		System.out.println(ans);

	}

	static String solve(StringBuilder str) {
		String fin = "";
		for (int i = 0; i < str.length(); i++) {
			System.out.println("i: " + i);
			StringBuilder temp = new StringBuilder("");
			while (i < str.length()) {
				if (str.charAt(i) != ' ' && i == str.length() - 1) {
					temp.append(str.charAt(i));
					i++;
					fin += temp.reverse().append(" ");
					break;

				}
				if (str.charAt(i) == ' ') {
					fin += temp.reverse().append(" ");
					break;
				}

				temp.append(str.charAt(i));
				i++;

			}
			// it will break at space;

		}
		return fin;
	}

}
