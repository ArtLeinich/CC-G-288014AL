package thema8.oop.grundlagen;

public class HundSpiel {

	public static void main(String[] args) {

		Hund hund1 = new Hund("Liker", "German Shepherd");
		hund1.bellen();
		
		Hund hund2 = new Hund("Bonny", "Chihuahua");
		hund2.fressen();
		
		Hund hund3 = new Hund("Bonny", "Chihuahua", 2024);
		hund3.fressen();
		
		
		// Hund1 spricht mit Hund2
		hund1.hallo(hund2);
		
		hund1.aendereNameVonFreund(hund2, "Boolie");
		hund2.bellen();
	}

}