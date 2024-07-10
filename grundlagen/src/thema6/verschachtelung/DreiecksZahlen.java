package thema6.verschachtelung;

public class DreiecksZahlen {

	public static void main(String[] args) {
		int max = 10;
		int[] dreiecksZahlen = new int[max];
		String[] dreiecksStrings = new String[max];

		for (int n = 1; n <= max; n++) {
			dreiecksZahlen[n - 1] = n * (n + 1) / 2;
			int sum = 0;
			String line = "";
			for (int i = 1; i <= n; i++) {
				if (i > 1) {
					line += "+";
				}
				line += i;
				sum += i;
			}
			line += "=" + sum;
			dreiecksStrings[n - 1] = line;
		}
		int maxLength = dreiecksStrings[max - 1].length();
		for (int i = 0; i < max; i++) {
			String line = dreiecksStrings[i];
			int spacesBefore = (maxLength - line.length()) / 2;
			String spaces = " ".repeat(spacesBefore);
			System.out.println(spaces + line);
		}
	}

}
