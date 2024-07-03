package thema3.anweisungen;

public class LogAusdruckG {

	public static void main(String[] args) {
	       
        int x = 2;
        int y = 2;
        
        boolean exprG = (x <= 3) ^ (y != 1);
        System.out.println("Ergebnis des logischen Ausdrucks (x <= 3) ^ (y != 1) für x=" + x + " und y=" + y + ": " + exprG);
    }

}
