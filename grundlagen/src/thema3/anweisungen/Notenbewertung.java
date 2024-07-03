package thema3.anweisungen;

import java.util.Scanner;

public class Notenbewertung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie bitte die Note der Prüfung ein: ");
		double note = scanner.nextDouble();
        if (note >= 1.0 && note <= 1.4) {
            System.out.println("Bewertung: Sehr gut");
        } else if (note >= 1.5 && note <= 2.4) {
            System.out.println("Bewertung: Gut");
        } else if (note >= 2.5 && note <= 3.4) {
            System.out.println("Bewertung: Befriedigend");
        } else if (note >= 3.5 && note <= 4.0) {
            System.out.println("Bewertung: Ausreichend");
        } else if (note >= 4.1 && note <= 5.0) {
            System.out.println("Bewertung: Nicht bestanden");
        } else {
            System.out.println("Ungültige Note");
        }
	    scanner.close();
	}

}
