package thema5.arrays.examples;

import java.util.Arrays;

public class Loeschen {

	public static int[] deleteArrayElement(int[] a, int w) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == w) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			return a;
		}
		int[] newArray = new int[a.length - 1];
		System.arraycopy(a, 0, newArray, 0, index);
		System.arraycopy(a, index + 1, newArray, index, a.length - index - 1);
		return newArray;
	}

	public static void main(String[] args) {
		int[] feld = { 4, 2, 10, 3, -5, 0, 17 };
		int w = -5;
		System.out.println("Feld: " + Arrays.toString(feld));
		System.out.println("Loeschende Element: " + w);
		feld = deleteArrayElement(feld, w);
		System.out.println("neues Feld: " + Arrays.toString(feld));
	}

}
