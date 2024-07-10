package thema7.rekursion;

class BaumKnoten {
    int wert;
    BaumKnoten links, rechts;

    BaumKnoten(int item) {
        wert = item;
        links = rechts = null;
    }
}

public class HoeheDesBaums {
    // Methode zur Berechnung der Höhe eines Binärbaums
    public static int hoeheBaum(BaumKnoten knoten) {
     
        if (knoten == null) {
            return 0;
        }
        // Rekursive Berechnung der Höhe des linken und rechten Teilbaums
        int linkeHoehe = hoeheBaum(knoten.links);
        int rechteHoehe = hoeheBaum(knoten.rechts);

        // Die Höhe des aktuellen Knotens ist 1 plus die größere der Höhen seiner Teilbäume
        return Math.max(linkeHoehe, rechteHoehe) + 1;
    }

    public static void main(String[] args) {
 
        BaumKnoten wurzel = new BaumKnoten(1);
        wurzel.links = new BaumKnoten(2);
        wurzel.rechts = new BaumKnoten(3);
        wurzel.links.links = new BaumKnoten(4);
        wurzel.links.rechts = new BaumKnoten(5);
//        wurzel.rechts.links = new BaumKnoten(6);
//        wurzel.rechts.rechts = new BaumKnoten(7);
    
        int hoehe = hoeheBaum(wurzel);
        System.out.println("Die Höhe des Baums ist: " + hoehe);
    }
}
