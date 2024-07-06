package thema4.schleifen;

public class PiZahl {

	public static void main(String[] args) {
		int n = 1000;
		int count = 0;

		for (int i = 0; i < n; i++) {
			double x = Math.random();
			double y = Math.random();
			double dist = x * x + y * y;

			if (dist <= 1.0) {
				count++;
			}
		}

		double pi = 4.0 * count / n;
		System.out.println("Die Pi Zahl: " + pi);
		System.out.println("Die genauere Pi Zahl: " + Math.PI);
	}
}
