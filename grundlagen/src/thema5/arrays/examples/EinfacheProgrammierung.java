package thema5.arrays.examples;

public class EinfacheProgrammierung {

	public static void main(String[] args) {
		int [] Array;
		Array = new int [5];
		Array[0] = 4;
		Array[1] = 10;
		Array[2] = 12;
		Array[3] = 25;
		Array[4] = 40;
	
		int summe = 0;
		for(int i=0; i < Array.length; i++) {
			summe = summe + Array[i];
			}
			System.out.println("Summe aller Elemente in diesem Array: " +summe);
	}

}
