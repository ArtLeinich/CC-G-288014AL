package thema3.anweisungen;

public class groessteZahl {

	public static void main(String[] args) {
		 int num1=12;
		 int num2=25;
		 int num3=9;
		
		 int largest;
	        if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }
	        
	        System.out.println("Die größte Zahl ist: " + largest);
	        
	        int result= Math.max(num1,Math.max(num2, num3));
	        System.out.println("Die größte Zahl ist: " + result);
	}

}
