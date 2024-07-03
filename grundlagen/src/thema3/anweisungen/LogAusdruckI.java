package thema3.anweisungen;

public class LogAusdruckI {

	public static void main(String[] args) {
	       
        int x = 3;
        int y = 4;
        boolean exprI = ( x*y<=10 ) && (y > 1);
        
        System.out.println("Ergebnis des logischen Ausdrucks ( x*y<=10 ) && (y > 1) für x=" + x + " und y=" + y + ": " + exprI);

    }


}
