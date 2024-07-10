package thema6.verschachtelung;

public class SternenPyramide {

    public static void main(String[] args) {
        int height = 15; // Höhe der Pyramide

        for (int i = 1; i <= height; i++) {
            // Leerzeichen vor den Sternen
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            // Sterne
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Neue Zeile für die nächste Ebene der Pyramide
        }
    }
}
