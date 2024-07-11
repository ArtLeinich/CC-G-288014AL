package thema8.oop.grundlagen;

public class Hund {

	public String name;
	
	public String rasse;
	
	public int jahrgang;
	
	public Hund() {
		this.name = "";
		this.rasse = "";
		this.jahrgang = 0;
	}
	
	public void aendereNameVonFreund(Hund hund, String neuerName) {
		hund.name = neuerName;
	}
	
	public void hallo(Hund hund) {
		System.out.println(this.name + " sagt Hallo an " + hund.name);
	}
	
	public Hund(String name) {
		this.name = name;
	}
	
	public Hund(String name, String rasse) {
		this.name = name;
		this.rasse = rasse;
	}
	
	public Hund(String name, String rasse, int jahrgang) {
		this.name = name;
		this.rasse = rasse;
		this.jahrgang = jahrgang;
	}

	public void bellen() {
		System.out.println(name + " bellt." );
	}
	
	public void fressen() {
		System.out.println(name + " frisst." );
	}
	
	public void schlafen() {
		System.out.println(name + " schläft." );
	}
}