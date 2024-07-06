package thema4.schleifen;

import java.util.Scanner;

public class Wurzelziehen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Zahl z ein: ");
		double z = scanner.nextDouble();
		int n = 100; // Anzahl der Iterationsschritte

		double links = 0;
		double rechts = z;

		for (int i = 1; i <= n; i++) {
			double m = (links + rechts) / 2;

			if (m * m < z) {
				links = m;
			} else {
				rechts = m;
			}

			System.out.println("Iteration " + i + ": links = " + links + ", rechts = " + rechts);
		}

		double approximierteWurzel = (links + rechts) / 2;
		System.out.println("Approximierte Wurzel von " + z + " nach " + n + " Iterationen: " + approximierteWurzel);

	}

}
