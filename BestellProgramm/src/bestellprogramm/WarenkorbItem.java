package bestellprogramm;

public class WarenkorbItem {
    private Produkt produkt;
    private Warenkorb warenkorb;
    private double preis;
    private int anzahl;

    public WarenkorbItem(Produkt produkt, Warenkorb warenkorb, double preis, int anzahl) {
        this.produkt = produkt;
        this.warenkorb = warenkorb;
        this.preis = preis;
        this.anzahl = anzahl;
    }
    
    public double getPreis() {
    	return preis;
    }
    
    public int getAnzahl() {
    	return anzahl;
    }

    @Override
    public String toString() {
        return "WarenkorbItem{" +
                "produkt=" + produkt +
                ", preis=" + preis +
                ", anzahl=" + anzahl +
                '}';
    }
}
