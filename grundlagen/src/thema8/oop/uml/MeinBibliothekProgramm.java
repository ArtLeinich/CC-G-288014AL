package thema8.oop.uml;

import java.util.ArrayList;
import java.util.List;

public class MeinBibliothekProgramm {

	public static void main(String[] args) {
		Bibliothek meineBibliothek = new Bibliothek();
		meineBibliothek.setName("Stadtbiobliothek");

		List<Buch> meineBuecher = new ArrayList<Buch>();
		meineBuecher.add(new Buch("Java ist eine Insel", "Autor 1", "123"));
		meineBuecher.add(new Buch("Clean Code", "Autor 2", "456"));
		meineBuecher.add(new Buch("Clean Architecture", "Autor 3", "789"));

		List<Mitglied> meineMitglieder = new ArrayList<Mitglied>();
			
        List<Buch> ausgelieheneBuecher1 = new ArrayList<Buch>();
        ausgelieheneBuecher1.add(meineBuecher.get(0));
        ausgelieheneBuecher1.add(meineBuecher.get(1));
        meineMitglieder.add(new Mitglied("Paul", "M001", ausgelieheneBuecher1));

        List<Buch> ausgelieheneBuecher2 = new ArrayList<Buch>();
        ausgelieheneBuecher2.add(meineBuecher.get(2));
        meineMitglieder.add(new Mitglied("Martin", "M002", ausgelieheneBuecher2));
        
    	meineBibliothek.setBuecher(meineBuecher);
		meineBibliothek.setMitglieder(meineMitglieder);

		System.out.println(meineBibliothek);
		System.out.println(meineMitglieder);

	}

}
