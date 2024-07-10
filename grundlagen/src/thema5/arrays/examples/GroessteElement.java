package thema5.arrays.examples;

import java.util.Arrays;

public class GroessteElement {

	public static void main(String[] args) {
		int[] array;
		array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println("Array: " + Arrays.toString(array));

		int max = array[0];
		int index = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
				index = i;
			}
		}
		System.out.println("Das größte Element im Array ist: " + max + " und Index: " + index);

	}

}
