package thema3.anweisungen;

public class LogAusdruckJ {

	public static void main(String[] args) {
	       
        int x = 3;
        int y = 2;
        boolean exprJ = ( 5 < 2*y ) && (x+y > 7);
        
        System.out.println("Ergebnis des logischen Ausdrucks ( 5 < 2*y ) && (x+y > 7) für x=" + x + " und y=" + y + ": " + exprJ);

    }
}
