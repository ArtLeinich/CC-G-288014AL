package thema3.anweisungen;

public class LogAusdruckD {

	public static void main(String[] args) {
	       
        int x = 11;
        int y = 1;
        boolean exprD = ((x+y) < 20) && (y < 2);
        
        System.out.println("Ergebnis des logischen Ausdrucks ((x+y) < 20) && (y < 2) für x=" + x + " und y=" + y + ": " + exprD);

    }
}
