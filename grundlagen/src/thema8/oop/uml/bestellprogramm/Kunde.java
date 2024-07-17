package thema8.oop.uml.bestellprogramm;

import java.util.List;

public class Kunde {
	
	private String name;
	private String adresse;
	private int kundenID;
	private String emailAdresse;
	private List<Bestellung> bestellungen;

	public Kunde(int kundenID, String name, String adresse, String emailAdresse) {
	//	super();
		this.name = name;
		this.adresse = adresse;
		this.kundenID = kundenID;
		this.emailAdresse = emailAdresse;
	}
	
	public int getKundenID() {
		return kundenID;
	}

	public void setKundenID(int kundenID) {
		this.kundenID = kundenID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getEmailAdresse() {
		return emailAdresse;
	}

	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
	}


	public List<Bestellung> getBestellungen() {
		return bestellungen;
	}

	public void setBestellungen(List<Bestellung> bestellungen) {
		this.bestellungen = bestellungen;
	}

	public void printBestellungenInfo() {
		double gesamteBetragAllerBestellungen = 0.0;
		System.out.println("KundenID: " + kundenID);
        System.out.println("Kundenname: " + name);
        System.out.println("Adresse: " + adresse);
        System.out.println("Email: " + emailAdresse);
        System.out.println("Bestellungen:");
        for (Bestellung bestellung : bestellungen) {
            System.out.println(bestellung);
            gesamteBetragAllerBestellungen += bestellung.getGesamtBetrag();
        }

        System.out.println("Gesamtbetrag aller Bestellungen: " + gesamteBetragAllerBestellungen);
        System.out.println("----------------------------");
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "KundenID=" + kundenID +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +              
                ", emailAdresse='" + emailAdresse + '\'' +
                '}';
    }
}
