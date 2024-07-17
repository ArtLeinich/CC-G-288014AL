package bestellprogramm;

public class Produkt {
    private int produktID;
    private String bezeichnung;
    private double preis;

    public Produkt(int produktID, String bezeichnung, double preis) {
        this.produktID = produktID;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
    
    public double getPreis() {
    	return preis;
    }
    
    @Override
    public String toString() {
        return "Produkt{" +
                "produktID=" + produktID +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", preis=" + preis +
                '}';
    }
}
