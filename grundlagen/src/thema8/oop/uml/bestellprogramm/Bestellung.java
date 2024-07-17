package thema8.oop.uml.bestellprogramm;

import java.util.Date;

public class Bestellung {
    private int bestellID;
    private Kunde kunde;
    private double gesamtBetrag;
    private Warenkorb warenkorb;
    private Date datum;

    public Bestellung(int bestellID, Kunde kunde, Warenkorb warenkorb, Date datum) {
        this.bestellID = bestellID;
        this.kunde = kunde;
        this.warenkorb = warenkorb;
        this.datum = datum; 
        this.gesamtBetrag = warenkorb.gesamtBetrag(); 
    }

    public int getBestellID() {
        return bestellID;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public double getGesamtBetrag() {
        return gesamtBetrag;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public Date getDatum() {
        return datum;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "Bestell-ID=" + bestellID +
                ", datum=" + datum +
        //        ", gesamtBetrag=" + gesamtBetrag +
                ", warenkorb=" + warenkorb +
                '}';
    }
}