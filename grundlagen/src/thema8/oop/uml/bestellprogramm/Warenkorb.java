package thema8.oop.uml.bestellprogramm;

import java.util.List;

public class Warenkorb {
    private List<WarenkorbItem> warenkorbItems;
    private double gesamtBetrag;
    private Kunde kunde;

    public Warenkorb(Kunde kunde, List<WarenkorbItem> warenkorbItems) {
        this.kunde = kunde;
        this.warenkorbItems = warenkorbItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Warenkorb: \n");
        for (WarenkorbItem item : warenkorbItems) {
            sb.append(item).append("\n");
        }
        sb.append("Gesamtbetrag: ").append(gesamtBetrag()).append("\n");
        return sb.toString();
    }

    public double gesamtBetrag() {
        gesamtBetrag = 0.0;
        for (WarenkorbItem item : warenkorbItems) {
            gesamtBetrag += item.getPreis() * item.getAnzahl();
        }
        return gesamtBetrag;
    }

    public void addItem(WarenkorbItem warenkorbItem) {
        warenkorbItems.add(warenkorbItem);
    }
}
