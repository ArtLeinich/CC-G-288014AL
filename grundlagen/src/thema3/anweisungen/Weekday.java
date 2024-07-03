package thema3.anweisungen;
import java.util.Scanner;

public class Weekday {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Bitte geben Sie eine Zahl zwischen 1 und 7 ein: ");
	        int dayNumber = scanner.nextInt();

	        switch (dayNumber) {
	            case 1:
	                System.out.println("Heute ist Montag");
	                break;
	            case 2:
	                System.out.println("Heute ist Dienstag");
	                break;
	            case 3:
	                System.out.println("Heute ist Mittwoch");
	                break;
	            case 4:
	                System.out.println("Heute ist Donnerstag");
	                break;
	            case 5:
	                System.out.println("Heute ist Freitag");
	                break;
	            case 6:
	                System.out.println("Heute ist Samstag");
	                break;
	            case 7:
	                System.out.println("Heute ist Sonntag");
	                break;
	            default:
	                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen 1 und 7 ein.");
	                break;
	        }

	        scanner.close();
	    }

}
