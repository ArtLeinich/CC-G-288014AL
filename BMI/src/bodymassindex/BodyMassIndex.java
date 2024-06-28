package bodymassindex;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie Ihre Größe in Meter ein: ");
		double groesse = scanner.nextDouble();
				
		System.out.print("Bitte geben Sie Ihr Gewicht in Kilogramm ein: ");
		double gewicht = scanner.nextDouble();
		
		double bmi = gewicht / (groesse * groesse);

	        System.out.println("Die Größe (in Meter): " + groesse);
	        System.out.println("Das Gewicht (in Kilogramm): " + gewicht);
	        System.out.println("Der berechnete BMI: " + bmi);
	        
   	        scanner.close();

	}

}
