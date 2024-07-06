package thema3.anweisungen;
import java.util.Scanner;
import java.util.Random;

public class Glueckspielautomat {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Willkommen beim Glücksspiel!");
        
        while (true) {
            System.out.print("Geben Sie Ihre Vermutung (eine ganze Zahl zwischen 1 und 100) ein oder 's' zum Beenden: ");
            String input = scanner.next();

            if (input.charAt(0) == 's') {
                System.out.println("Spiel beendet. Vielen Dank fürs Spielen!");
                break;
            }

       //    random.nextInt(100);
            int generatedNumber = random.nextInt(100) + 1;
            System.out.println("Die generierte Zahl lautet: " + generatedNumber);

            if (generatedNumber >= 40 && generatedNumber <= 60) {
                System.out.println("Herzlichen Glückwunsch! Sie haben gewonnen!");
            } else {
                System.out.println("Leider verloren. Versuchen Sie es beim naechsten Mal!");
            }
        }
        
        scanner.close();
    }

}
