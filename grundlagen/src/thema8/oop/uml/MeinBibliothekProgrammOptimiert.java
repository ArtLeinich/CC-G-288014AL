package thema8.oop.uml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeinBibliothekProgrammOptimiert {

	public static void main(String[] args) {

		Bibliothek meineBibliothek = new Bibliothek();
		meineBibliothek.setName("Stadtbiobliothek");

		List<Buch> meineBuecher = new ArrayList<Buch>();
		Buch buch1 = new Buch("Java ist eine Insel", "Autor 1", "123");
		Buch buch2 = new Buch("Clean Code", "Autor 2", "456");
		Buch buch3 = new Buch("Clean Architecture", "Autor 3", "789");
		meineBuecher.addAll(Arrays.asList(buch1, buch2, buch3));

		meineBibliothek.setBuecher(meineBuecher);

		List<Mitglied> meineMitglieder = new ArrayList<Mitglied>();
		Mitglied mitglied1 = new Mitglied("Andreas", "001", Arrays.asList(buch1));
		Mitglied mitglied2 = new Mitglied("Markus", "002", Arrays.asList(buch2, buch3));
		Mitglied mitglied3 = new Mitglied("John", "003", null);

		meineBibliothek.setMitglieder(Arrays.asList(mitglied1, mitglied2, mitglied3));

		System.out.println(meineBibliothek);

	}

}