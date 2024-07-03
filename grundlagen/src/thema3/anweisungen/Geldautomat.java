package thema3.anweisungen;
import java.util.Scanner;

public class Geldautomat {

	public static void main(String[] args) {
      
        double guthaben = 346.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ihr Guthaben beläuft sich auf " + guthaben + " Euro.");
        System.out.print("Wie viel Geld möchten Sie abheben? ");
        double abhebungsbetrag = scanner.nextDouble();
        if (abhebungsbetrag > guthaben) {
            System.out.println("Keine Auszahlung möglich! Der angegebene Betrag übersteigt Ihr Guthaben.");
            System.out.println("Ihr Guthaben beträgt " + guthaben + " Euro.");
        } else {
            guthaben -= abhebungsbetrag;
            System.out.println("Es werden " + abhebungsbetrag + " Euro ausgezahlt.");
            System.out.println("Ihr Konto beträgt " + guthaben + " Euro.");
        }
        scanner.close();
    }

}
