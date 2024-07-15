package thema8.oop.uml;

import java.util.List;

public class Mitglied {

    private String name;
    private String mitgliedsnummer;
    private List<Buch> ausgelieheneBuecher;

    public Mitglied(String name, String mitgliedsnummer, List<Buch> ausgelieheneBuecher) {
        this.name = name;
        this.mitgliedsnummer = mitgliedsnummer;
        this.ausgelieheneBuecher = ausgelieheneBuecher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMitgliedsnummer() {
        return mitgliedsnummer;
    }

    public void setMitgliedsnummer(String mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public List<Buch> getAusgelieheneBuecher() {
        return ausgelieheneBuecher;
    }

    public void setAusgelieheneBuecher(List<Buch> ausgelieheneBuecher) {
        this.ausgelieheneBuecher = ausgelieheneBuecher;
    }

	@Override
	public String toString() {
		return "Mitglied [Name=" + name + ", Mitgliedsnummer=" + mitgliedsnummer + ", AusgelieheneBuecher="
				+ ausgelieheneBuecher + "]";
	}
      
    

}
