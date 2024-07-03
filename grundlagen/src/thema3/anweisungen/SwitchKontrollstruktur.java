package thema3.anweisungen;

import java.util.Scanner;

public class SwitchKontrollstruktur {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie eine Zahl zwischen 0 und 9 ein: ");
		int choice = scanner.nextInt();
		switch(choice) {
			case 0:
		    case 1:
		    case 2:
		    case 3:
		        System.out.println("Bereich Null bis Drei");
		        break;		       
		    case 4:
		    case 5:
		    case 6:
		    case 7:
		        System.out.println("Bereich Vier bis Sieben");
		        break;		   
		    case 8:
		    case 9:
		        System.out.println("Bereich Acht bis Neun");
		        break;
		    default:
		        System.out.println("Die Zahl liegt nicht im Bereich von 0 bis 9");
		        break;
		        }
		scanner.close();

	}

}
