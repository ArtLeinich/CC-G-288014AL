package thema8.oop.uml.bestellprogramm;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BestellProgramm {
    public static void main(String[] args) {
  
        Produkt produkt1 = new Produkt(1, "Laptop", 1500.00);
        Produkt produkt2 = new Produkt(2, "Smartphone", 800.00);
        Produkt produkt3 = new Produkt(3, "Tablet", 400.00);
        Produkt produkt4 = new Produkt(4, "Monitor", 300.00);
        Produkt produkt5 = new Produkt(5, "Keyboard", 99.99);

        Kunde kunde1 = new Kunde(1001, "Max Mustermann", "Musterstraße 1", "max@muster.de");
        Kunde kunde2 = new Kunde(1002, "Erika Musterfrau", "Beispielweg 2", "erika@musterfirma.de");
        Kunde kunde3 = new Kunde(1003, "John Doe", "Example Road 3", "john@muster.de");

        Date date1 = Date.from(LocalDate.of(2023, 7, 1).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(LocalDate.of(2023, 7, 2).atStartOfDay(ZoneId.systemDefault()).toInstant());
     //   Date date3 = Date.from(LocalDate.of(2023, 7, 3).atStartOfDay(ZoneId.systemDefault()).toInstant());

        // Kunde 1
        List<WarenkorbItem> warenkorbItems1 = new ArrayList<>();
        Warenkorb warenkorb1 = new Warenkorb(kunde1, warenkorbItems1);
        warenkorb1.addItem(new WarenkorbItem(produkt1, warenkorb1, produkt1.getPreis(), 1));
        warenkorb1.addItem(new WarenkorbItem(produkt2, warenkorb1, produkt2.getPreis(), 2));
        Bestellung bestellung1 = new Bestellung(1, kunde1, warenkorb1, date1);

        //  Zweite Bestellung des Kunden 1
        List<WarenkorbItem> warenkorbItems1b = new ArrayList<>();
        Warenkorb warenkorb1b = new Warenkorb(kunde1, warenkorbItems1b);
        warenkorb1b.addItem(new WarenkorbItem(produkt3, warenkorb1b, produkt3.getPreis(), 3));
        Bestellung bestellung1b = new Bestellung(4, kunde1, warenkorb1b, new Date());

        // Kunde 2
        List<WarenkorbItem> warenkorbItems2 = new ArrayList<>();
        Warenkorb warenkorb2 = new Warenkorb(kunde2, warenkorbItems2);
        warenkorb2.addItem(new WarenkorbItem(produkt3, warenkorb2, produkt3.getPreis(), 3));
        warenkorb2.addItem(new WarenkorbItem(produkt4, warenkorb2, produkt4.getPreis(), 1));
        Bestellung bestellung2 = new Bestellung(2, kunde2, warenkorb2, date2);

        // Kunde 3
        List<WarenkorbItem> warenkorbItems3 = new ArrayList<>();
        Warenkorb warenkorb3 = new Warenkorb(kunde3, warenkorbItems3);
        warenkorb3.addItem(new WarenkorbItem(produkt5, warenkorb3, produkt5.getPreis(), 5));
        Bestellung bestellung3 = new Bestellung(3, kunde3, warenkorb3, new Date());

        //
        kunde1.setBestellungen(List.of(bestellung1, bestellung1b));
        kunde2.setBestellungen(List.of(bestellung2));
        kunde3.setBestellungen(List.of(bestellung3));

        // Informationsausgabe 
        List<Kunde> kundenListe = List.of(kunde1, kunde2, kunde3);

        for (Kunde kunde : kundenListe) {
            kunde.printBestellungenInfo();
        }
    }
}
