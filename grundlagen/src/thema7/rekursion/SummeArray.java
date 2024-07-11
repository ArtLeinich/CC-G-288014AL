package thema7.rekursion;

public class SummeArray {

	public static void main(String[] args) {
		int[] zahlen = { 1, 2, 3, 4, 5, 6 };
		int summe = summeArray(zahlen, 0);
		System.out.println("Die Summe der Elemente im Array ist: " + summe);
	}

	private static int summeArray(int[] zahlen, int i) {
		if (i == zahlen.length) {
			return 0;
		}
		return zahlen[i] + summeArray(zahlen, i + 1);
	}
}
