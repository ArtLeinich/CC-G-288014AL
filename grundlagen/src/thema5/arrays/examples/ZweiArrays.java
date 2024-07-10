package thema5.arrays.examples;

import java.util.Arrays;

public class ZweiArrays {

	public static void main(String[] args) {
		int[] feld1;
		feld1 = new int[20];
		for (int i = 0; i < feld1.length; i++) {
			feld1[i] = 2 * (int) (Math.random() * 50);
		}
		int[] feld2;
		feld2 = new int[20];
		for (int i = 0; i < feld2.length; i++) {
			feld2[i] = (int) (Math.random() * 100) + 1;
		}
		Arrays.sort(feld2);

		System.out.println("Feld 1 (gerade Zufallszahlen): " + Arrays.toString(feld1));
		System.out.println("Feld 2 (aufsteigend sortierte Zufallszahlen): " + Arrays.toString(feld2));

	}

}
