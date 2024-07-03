package thema3.anweisungen;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wählen Sie eine Operation: ");
		System.out.println("1. Addition ");
		System.out.println("2. Subtraktion ");
		System.out.println("3. Multiplikation ");
		System.out.println("4. Division ");
		
		System.out.println("Ihre Auswahl: ");
		int choice = scanner.nextInt();
		
		System.out.println("Geben Sie die erste Zahl ein: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Geben Sie die zweite Zahl ein: ");
		int num2 = scanner.nextInt();
		
		switch(choice) {
			case 1:
				System.out.println("Ergebnis der Addition: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Ergebnis der Subtraktion: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Ergebnis der Multiplikation: " + (num1*num2));
				break;	
			case 4:
				System.out.println("Ergebnis der Division: " + (num1/num2));
				break;
				
		}
		
		scanner.close();

	}


}
