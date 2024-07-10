package thema5.arrays.examples;

import java.util.Arrays;

public class Tauschen {

	public static int[] swap(int[] a, int i, int j) {
		if (i >= 0 && i < a.length && j >= 0 && j < a.length) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		} else {
			System.out.println("Ungültige Indizes. Kein Tausch durchgeführt.");
		}
		return a;
	}

	public static void main(String[] args) {
		int[] feld = { 4, 2, 10, 3, -5, 0, 17 };

		int parameter1 = 0;
		int parameter2 = 1;

		System.out.println("Feld: " + Arrays.toString(feld));
		System.out.println("Parameter 1: " + parameter1);
		System.out.println("Parameter 2: " + parameter2);

		feld = swap(feld, parameter1, parameter2);

		System.out.println("neues Feld: " + Arrays.toString(feld));
	}

}
