package thema3.anweisungen;
import java.util.Scanner;

public class NumberCheck {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
	        int number = scanner.nextInt();
	 
	        if (number > 0) {
	            System.out.println("Die Zahl ist positiv.");
	        } else if (number < 0) {
	            System.out.println("Die Zahl ist negativ.");
	        } else {
	            System.out.println("Die Zahl ist 0.");
	        }
	        if (number % 2 == 0) {
	            System.out.println("Die Zahl ist gerade.");
	        } else {
	            System.out.println("Die Zahl ist ungerade.");
	        }
	        scanner.close();
	    }

}
