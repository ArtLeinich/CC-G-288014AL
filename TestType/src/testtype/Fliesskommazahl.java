package testtype;
import java.util.Scanner;

public class Fliesskommazahl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bitte geben Sie eine double Zahl ein: ");
		double zahl = scanner.nextDouble();
		double erG = (int) ((zahl * 100.0) + 0.5);
		erG = erG / 100.0;
        System.out.println("Zahl: " + zahl + ", gerundet: " + erG);
		scanner.close();
	}

}
